package com.application.Service;

import com.application.Repository.User;
import com.application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getByEmail(String email){
        return userRepository.findById(email).orElse(null);
    }
    public boolean verfyUser(String email){
        return userRepository.existsById(email);
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(User user){
         userRepository.delete(user);
    }

}
