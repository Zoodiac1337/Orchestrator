package com.example.Orchestrator.main;

import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.trips.TripsInterest;
import com.example.Orchestrator.users.Users;
import com.example.Orchestrator.weather.Forecastday;
import com.example.Orchestrator.weather.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)

public class Controller {

    private final Service service;
    @Autowired
    public Controller(com.example.Orchestrator.main.Service userService, Service service) {
        this.service = service;
    }

    @GetMapping(path = "users")
    public List<Users> users() {return service.getUsers();
    }
    @GetMapping(path = "trips", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Trips> trips() {return service.getTrips();
    }
    @GetMapping(path = "tripsInterest", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TripsInterest> tripsInterest() {return service.getTripsInterest();
    }
    @GetMapping(path = "tripsInterestByUserID", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<ArrayList<TripsInterest>> tripsInterestByUserId(@RequestParam int userid) {return service.getTripsInterestByUserID(userid);
    }
    @GetMapping(path = "tripsInterestByTripID", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<ArrayList<TripsInterest>> tripsInterestByTripId(@RequestParam int tripid) {return service.getTripsInterestByTripID(tripid);
    }
    @GetMapping(path = "weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Forecastday> weather(@RequestParam String location) throws IOException {return Weather.getWeather(location);}
    @GetMapping(path = "tripsByID", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<ArrayList<Trips>> tripsById(@RequestParam int userid) {return service.getTripsByID(userid);
    }
    @GetMapping(path = "tripsByTripID", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Trips> tripsByTripId(@RequestParam int tripid) {return service.getTripsByTripID(tripid);
    }
    @GetMapping(path = "tripsByLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<ArrayList<Trips>> tripsByLocation(@RequestParam String location) {return service.getTripsByLocation(location);
    }


    @PostMapping("login")
    public String logIn(@RequestBody Users user) {
        return service.logIn(user);
    }
    @PostMapping(path = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createNewUser (@RequestBody Users users) throws IOException { service.addNewUser(users);
    }
    @PostMapping(path = "newTrip")
    public void createNewTrip(@RequestBody Trips trips) throws IOException {
        service.addNewTrip(trips);
    }
    @PostMapping(path = "newTripInterest")
    public void createNewTripInterest(@RequestBody TripsInterest tripsInterest) throws IOException {
        service.addNewTripInterest(tripsInterest);
    }
    @PostMapping(path = "removeTripInterest")
    public void removeTripInterest(@RequestBody TripsInterest tripsInterest)  {
        service.deleteTripInterest(tripsInterest);
    }

}
