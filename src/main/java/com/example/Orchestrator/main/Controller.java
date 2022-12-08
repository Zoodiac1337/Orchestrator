package com.example.Orchestrator.main;

import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)

public class Controller {

    private final Service service;
    @Autowired
    public Controller(com.example.Orchestrator.main.Service userService, Service service) {
        this.service = service;
    }
//Users
    @GetMapping(path = "users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Users> users() {
        return service.getUsers();
    }
    @PostMapping(path = "users")
    public void registerNewUser(@RequestBody Users users) {
        service.addNewUser(users);
    }
//Trips
    @GetMapping(path = "trips", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Trips> trips() {return service.getTrips();
    }
    @PostMapping(path = "trips")
    public void createNewTrip(@RequestBody Trips trips) {
        service.addNewTrip(trips);
    }
//Weather
    @GetMapping(path = "weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public String weather() throws IOException, InterruptedException {return Weather.getWeather("Nottingham", LocalDate.of(2022,12,26));}
}
