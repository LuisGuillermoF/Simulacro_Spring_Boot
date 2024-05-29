package com.riwi.Simulacro_Spring_Boot.domain.entities;

import com.riwi.Simulacro_Spring_Boot.util.role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameUser;
    private String passwordUser;
    private String emailUser;
    private String fullName;
    private role role;

    @OneToMany(
        mappedBy="coursesId",
        cascade = CascadeType.ALL,
        orphanRemoval = false, 
        fetch = FetchType.EAGER
    )
    private enrollments enrollment;
}