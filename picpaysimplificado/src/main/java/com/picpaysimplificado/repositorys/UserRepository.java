package com.picpaysimplificado.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
} 