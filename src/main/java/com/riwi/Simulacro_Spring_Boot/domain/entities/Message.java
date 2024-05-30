package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private LocalDateTime date;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Sender",referencedColumnName = "id")
    private User userSender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Receiver",referencedColumnName = "id")
    private User userReceiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coursesId",referencedColumnName = "id")
    private Course courses;
}
