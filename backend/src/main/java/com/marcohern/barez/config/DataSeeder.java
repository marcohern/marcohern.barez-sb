package com.marcohern.barez.config;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.domain.enums.Role;
import com.marcohern.barez.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(DataSeeder.class);

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataSeeder(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!userRepository.existsByEmail("admin@barez.com")) {
            User manager = new User("Admin", "admin@barez.com",
                    passwordEncoder.encode("admin123"), Role.MANAGER);
            userRepository.save(manager);
            log.info("Seeded default manager: admin@barez.com / admin123");
        }
    }
}
