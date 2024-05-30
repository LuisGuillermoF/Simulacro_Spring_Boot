package com.riwi.Simulacro_Spring_Boot.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Courses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCourse;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "courses_id", fetch = FetchType.LAZY,cascade =  CascadeType.REFRESH)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "lessons",fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    private List<Lesson> lessons;

    @OneToMany(mappedBy = "courses",fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    private List<Message> messages;
}
