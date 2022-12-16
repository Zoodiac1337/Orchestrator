package com.example.Orchestrator.main;

import com.example.Orchestrator.random.RandomNumber;
import com.example.Orchestrator.trips.Trips;
import com.example.Orchestrator.trips.TripsInterest;
import com.example.Orchestrator.trips.TripsInterestRepository;
import com.example.Orchestrator.trips.TripsRepository;
import com.example.Orchestrator.users.Users;
import com.example.Orchestrator.users.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class Config {

    public Config() throws IOException {
    }

    @Bean
    CommandLineRunner commandLineRunnerUsers(UsersRepository repository) {
        return args -> {
            Users root = new Users(12345,"root","root");
            Users user = new Users(54321,"user","user");
            repository.saveAll(List.of(root, user));
        };
    }

    @Bean
    CommandLineRunner commandLineRunnerTrips(TripsRepository repository) {
        return args -> {
            Trips trip1 = new Trips(1234567, 12345, "Nottingham", LocalDate.of(2022, 12, 10));
            Trips trip2 = new Trips(7654321, 54321, "Birmingham", LocalDate.of(2023, 1, 15));
            repository.saveAll(List.of(trip1, trip2));
        };
    }
    @Bean
    CommandLineRunner commandLineRunnerTripsInterest(TripsInterestRepository repository) {
        return args -> {
            TripsInterest tripInterest = new TripsInterest(1234567, 54321, "user");
            TripsInterest tripInterest2 = new TripsInterest(7654321, 12345, "root");
            repository.saveAll(List.of(tripInterest, tripInterest2));
        };
    }
}
