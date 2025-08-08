package com.nagesh.complaintsystem.repository;

 
import com.nagesh.complaintsystem.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom queries like:
    boolean existsByEmail(String email);      // ✅ add this line

    Optional<User> findByEmail(String email);
 

}
