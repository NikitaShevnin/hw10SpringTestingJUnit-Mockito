package ru.gb.SpringTesting.service;

import org.springframework.stereotype.Service;
import ru.gb.SpringTesting.model.User;
import ru.gb.SpringTesting.model.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
