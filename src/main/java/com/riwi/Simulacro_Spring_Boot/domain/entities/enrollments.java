package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
<<<<<<< HEAD
=======
import lombok.Data;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
import lombok.NoArgsConstructor;

@Entity (name = "enrollments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;

<<<<<<< HEAD
    
=======
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id_enrollments", referencedColumnName = "id")
    private List<user> courseEnrollsments;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "courses_id_enrollments")
    private List<courses> courses_id;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
}
