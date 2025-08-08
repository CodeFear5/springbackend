package com.nagesh.complaintsystem.service;

import com.nagesh.complaintsystem.model.User;
import com.nagesh.complaintsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User u = repo.findByEmail(email).orElseThrow();
        return new org.springframework.security.core.userdetails.User(
                u.getEmail(),
                u.getPassword(),
                java.util.List.of(() -> "ROLE_" + u.getRole())
        );
    }
}
