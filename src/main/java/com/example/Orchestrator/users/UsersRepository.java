package com.example.Orchestrator.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findUsersByUsername(String username);
    Optional<Users> findUsersByUserID(int userID);
    Optional<Users> findUsersByUsernameAndPassword(String username, String password);
}
