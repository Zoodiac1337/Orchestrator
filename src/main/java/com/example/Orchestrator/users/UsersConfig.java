package com.example.Orchestrator.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsersConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository) {
        return args -> {
            Users root = new Users(1234567,"root","root");
            Users user = new Users(1239876,"user","user");
            repository.saveAll(List.of(root, user));
        };
    }
}
