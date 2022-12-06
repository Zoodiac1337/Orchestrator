package com.example.Orchestrator.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();

    }

    public void addNewUser(Users users) {
        Optional<Users> usersByUsername = usersRepository.findUsersByUsername(users.getUsername());
        if (usersByUsername.isPresent()) {
            throw new IllegalStateException("Username taken");
        }
        else usersRepository.save(users);
    }
}
