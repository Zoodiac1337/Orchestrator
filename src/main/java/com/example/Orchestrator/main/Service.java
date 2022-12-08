package com.example.Orchestrator.main;

import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.trips.TripsRepository;
import com.example.Orchestrator.users.Users;
import com.example.Orchestrator.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private final UsersRepository usersRepository;
    private final TripsRepository tripsRepository;

    @Autowired
    public Service(UsersRepository usersRepository, TripsRepository tripsRepository) {
        this.usersRepository = usersRepository;
        this.tripsRepository = tripsRepository;
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

    public List<Trips> getTrips() {
        return tripsRepository.findAll();

    }
    public void addNewTrip(Trips trips) {
        tripsRepository.save(trips);
    }
}
