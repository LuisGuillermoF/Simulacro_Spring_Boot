package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import com.riwi.Simulacro_Spring_Boot.util.role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL)
    private List<courses> courses;

    @OneToMany(mappedBy = "courseEnrollsments",cascade = CascadeType.ALL)
    private List<enrollments> enrollments;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<submissions> submissions;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<messages> messages;
}