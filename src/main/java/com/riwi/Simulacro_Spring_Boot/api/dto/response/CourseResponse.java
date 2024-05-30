package com.riwi.Simulacro_Spring_Boot.api.dto.response;


import com.riwi.Simulacro_Spring_Boot.domain.entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseResponse {
    private Long id;
    private String nameCourse;
    private String description;
    private User user;

}
