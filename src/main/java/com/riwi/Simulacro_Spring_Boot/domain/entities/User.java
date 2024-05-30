package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import javax.management.relation.Role;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class User {
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
    private Role role;



    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL)
    private List<Course> courses;

    @OneToMany(mappedBy = "courseEnrollsments",cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Submission> submissions;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Message> messages;

    @OneToMany(mappedBy = "senderId",cascade = CascadeType.ALL)
    private List<Message> messagesSender;

    @OneToMany(mappedBy = "receiverId",cascade = CascadeType.ALL)
    private List<Message> messagesReceiver;

}