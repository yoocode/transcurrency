package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.models.User;
import com.zipcode.transcurrency.Transcurrency.repositories.IUserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserService userService;

    @Mock
    private IUserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    public void getAllUsers() throws Exception {

        User user1 = new User();
        List<User> userData = new ArrayList<>();
        userData.add(user1);

        when(userService.getAllUsers()).thenReturn(userData);
        List<User> users = userService.getAllUsers();

        assertEquals(users.size(), 1);
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();


    }

    @Test
    public void deleteUser() throws Exception {

    }

}