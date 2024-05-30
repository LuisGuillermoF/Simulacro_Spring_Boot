package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import com.riwi.Simulacro_Spring_Boot.util.Role;

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
import lombok.ToString;

@Entity (name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @ToString.Exclude
    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Course> courses;
    @ToString.Exclude

    @OneToMany(mappedBy = "courseEnrollsments",cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;
    @ToString.Exclude

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Submission> submissions;

    @ToString.Exclude

    @OneToMany(mappedBy = "userSender",cascade = CascadeType.ALL)
    private List<Message> messagesSender;
    @ToString.Exclude

    @OneToMany(mappedBy = "userReceiver",cascade = CascadeType.ALL)
    private List<Message> messagesReceiver;
}