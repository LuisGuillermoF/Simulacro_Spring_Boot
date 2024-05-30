package com.riwi.Simulacro_Spring_Boot.domain.entities;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "assignments")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime data;
    

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lessons_id",referencedColumnName = "id")
    private Assignment assigments;

    @OneToMany(mappedBy = "submissions",cascade = CascadeType.REFRESH)
    private List<Submission> submissions;
}
