package com.riwi.Simulacro_Spring_Boot.api.dto.response;

import com.riwi.Simulacro_Spring_Boot.util.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String fullName;
    private String passwordUser;
    private String emailUser;
    private Role role;
}
