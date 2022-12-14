package com.example.Orchestrator.trips;

import com.example.Orchestrator.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TripsRepository extends JpaRepository<Trips, Integer> {
    Optional<Trips> findTripsByTripID(int TripID);
    Optional<Trips> findTripsByUserID(int UserID);
    Optional<Trips> findTripsByLocation(String Location);
}