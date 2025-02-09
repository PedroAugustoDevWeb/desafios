package com.picpaysimplificado.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.picpaysimplificado.models.User;
import com.picpaysimplificado.models.UserType;
import com.picpaysimplificado.repositorys.UserRepository;

public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) {       

        if (sender.getUserType() == UserType.MERCHANT) {
            throw new RuntimeException("Usuário não possui saldo suficiente");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Usuário não possui saldo suficiente");
        }
}

    public User findUserById(Long id) {
        return userRepository.findUserById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
