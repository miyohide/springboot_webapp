package com.github.miyohide.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void findByEmailTest() {
        String email = "user_repository_test@example.com";
        User u = userRepository.save(new User(email, "password", "ROLE_USER"));
        Optional<User> maybeUser = userRepository.findByEmail(email);
        assertTrue(maybeUser.isPresent());
        maybeUser.ifPresent(user -> assertEquals(email, user.getEmail()));
    }
}
