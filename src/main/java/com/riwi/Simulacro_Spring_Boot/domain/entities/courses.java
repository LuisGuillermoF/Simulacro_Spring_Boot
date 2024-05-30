package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.ManyToMany;
=======
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Courses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCourse;
    private String description;

<<<<<<< HEAD
    @ManyToMany(
        mappedBy="coursesId",
        cascade = CascadeType.ALL,
        orphanRemoval = false, 
        fetch = FetchType.EAGER
    )
    private 
=======
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<user> user;

    @OneToMany(mappedBy = "courses_id", fetch = FetchType.LAZY,cascade =  CascadeType.REFRESH)
    private List<enrollments> enrollments;

    @OneToMany(mappedBy = "lessons",fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    private List<lessons> lessons;

    @OneToMany(mappedBy = "courses",fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    private List<messages> messages;
>>>>>>> 11de2d605e2d6e23f6adec9e3775175639d567ca
}
