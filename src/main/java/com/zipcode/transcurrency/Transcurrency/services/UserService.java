package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.models.User;
import com.zipcode.transcurrency.Transcurrency.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public boolean addUserWithVerification(User user){
        if(userRepository.equals(user)){
            return false;
        }
        userRepository.save(user);
        return true;
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
