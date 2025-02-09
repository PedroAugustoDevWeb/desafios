package com.picpaysimples.picpaysimples.entity;

import jakarta.persistence.*;
import lombok.*;

import com.picpaysimples.picpaysimples.enums.UserType;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // Deve ser armazenado criptografado

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType userType; // COMMON ou MERCHANT

    @OneToOne(mappedBy = "user")
    private Wallet wallet;
}
