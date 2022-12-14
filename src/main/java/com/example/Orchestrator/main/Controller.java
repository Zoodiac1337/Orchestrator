package com.example.Orchestrator.main;

import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.users.Users;
import com.example.Orchestrator.weather.Day;
import com.example.Orchestrator.weather.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
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
    @GetMapping(path = "weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public Day weather() throws IOException {return Weather.getWeather("Nottingham", LocalDate.of(2023,1,26));}
    @GetMapping(path = "tripsByID", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Trips> tripsById(@RequestParam int userid) {return service.getTripsByID(userid);
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
}
