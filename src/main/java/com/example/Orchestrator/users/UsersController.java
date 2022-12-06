package com.example.Orchestrator.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/users")

public class UsersController {

    private final UsersService usersService;
    @Autowired
    public UsersController(UsersService userService) {
        this.usersService = userService;
    }

    @GetMapping
    public List<Users> hello() {
        return usersService.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody Users users) {
        usersService.addNewUser(users);
    }

}
