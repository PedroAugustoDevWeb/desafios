package com.picpaysimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.models.Transaction;

public interface transactionRepository extends JpaRepository<Transaction, Long>{
        
}
