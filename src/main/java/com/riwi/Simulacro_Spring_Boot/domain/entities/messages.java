package com.riwi.Simulacro_Spring_Boot.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
