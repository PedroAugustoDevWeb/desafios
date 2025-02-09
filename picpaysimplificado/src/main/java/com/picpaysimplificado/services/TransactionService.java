package com.picpaysimplificado.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.picpaysimplificado.repositorys.TransactionRepository;

public class TransactionService {

    @Autowired
    private UserServices userService;   

    @Autowired
    private TransactionRepository transactionRepository;

    public void createTransaction() {

        this.userService.validateTransaction(sender, amount);

        Transaction transaction = new Transaction();

        transaction.setSender(sender);

        transaction.setReceiver(receiver);

        transaction.setAmount(amount);

        transactionRepository.save(transaction);
    }
    
}
