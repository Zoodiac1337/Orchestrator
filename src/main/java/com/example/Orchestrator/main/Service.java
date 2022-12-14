package com.example.Orchestrator.main;

import com.example.Orchestrator.random.RandomNumber;
import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.trips.TripsRepository;
import com.example.Orchestrator.users.Users;
import com.example.Orchestrator.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
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

    public void addNewUser(Users users) throws IOException {
        int newUserId = RandomNumber.getRandomNumber(10000, 99999);
        Optional<Users> usersByUserID = usersRepository.findUsersByUserID(newUserId);
        Optional<Users> usersByUsername = usersRepository.findUsersByUsername(users.getUsername());
        if (usersByUsername.isPresent()) {
            throw new IllegalStateException("Username taken");
        }
        else
            //ensuring that the userID is unique
            while (usersByUserID.isPresent())
            {
                newUserId = RandomNumber.getRandomNumber(10000, 99999);
                usersByUserID = usersRepository.findUsersByUserID(newUserId);
            }
            users.setUserID(newUserId);
            usersRepository.save(users);
    }

    public List<Trips> getTrips() {
        return tripsRepository.findAll();
    }
    public void addNewTrip(Trips trips) throws IOException {
        int newTripID = RandomNumber.getRandomNumber(1000000, 9999999);
        Optional<Trips> tripsByTripID = tripsRepository.findTripsByTripID(newTripID);
        while (tripsByTripID.isPresent())
        {
            newTripID = RandomNumber.getRandomNumber(1000000, 9999999);
            tripsByTripID = tripsRepository.findTripsByTripID(newTripID);
        }
        trips.setTripID(newTripID);
        tripsRepository.save(trips);
    }

    public String logIn(Users user){
        Optional<Users> usersByCredentials = usersRepository.findUsersByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (usersByCredentials.isEmpty()) {
            throw new IllegalStateException("Wrong credentials");
        }
        else
            return ("{\"userID\":"+usersByCredentials.get().getUserID()+"}");
    }

    public Optional<Trips> getTripsByID(int userID) {
        return tripsRepository.findTripsByUserID(userID);
    }
}
