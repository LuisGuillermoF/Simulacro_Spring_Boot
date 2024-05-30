package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import com.riwi.Simulacro_Spring_Boot.util.role;

import jakarta.persistence.CascadeType;
<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private String nameUser;
    @Column(length = 30, nullable = false)
    private String passwordUser;
    @Column(length = 40, nullable = false)
    private String emailUser;
    @Column(length = 50, nullable = false)
    private String fullName;
    @Enumerated(EnumType.STRING)
    private role role;

<<<<<<< HEAD
    @OneToMany(
        mappedBy="userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false, 
        fetch = FetchType.EAGER
    )
    private enrollments enrollment;
=======
    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL)
    private List<courses> courses;

    @OneToMany(mappedBy = "courseEnrollsments",cascade = CascadeType.ALL)
    private List<enrollments> enrollments;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<submissions> submissions;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<messages> messages;

    @OneToMany(mappedBy = "senderId",cascade = CascadeType.ALL)
    private List<messages> messagesSender;

    @OneToMany(mappedBy = "receiverId",cascade = CascadeType.ALL)
    private List<messages> messagesReceiver;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
}