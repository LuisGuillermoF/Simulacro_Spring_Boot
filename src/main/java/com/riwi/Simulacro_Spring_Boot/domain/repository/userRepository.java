package com.riwi.Simulacro_Spring_Boot.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.Simulacro_Spring_Boot.domain.entities.User;

@Repository
public interface userRepository extends JpaRepository<User,Long>{
    
}
