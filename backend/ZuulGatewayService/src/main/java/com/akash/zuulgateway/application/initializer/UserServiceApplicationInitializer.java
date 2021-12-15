package com.akash.zuulgateway.application.initializer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.akash.zuulgateway.application.dao.UserRepository;
import com.akash.zuulgateway.application.model.User;

@Component
public class UserServiceApplicationInitializer implements CommandLineRunner
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception
    {
        userRepository.deleteAll();
        User admin = new User("admin", passwordEncoder.encode("password"), "dasakashudp1998@gmail.com", "8119990096");
        admin.setRole("ADMIN");
        admin.setConfirmed(true);
        userRepository.save(admin);
    }
}
