package com.zipcode.transcurrency.Transcurrency.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user1 = new User();

//    @Before
//    public void setUp() throws Exception {
//        user1 = new User();
//    }

    @Test
    public void getId() throws Exception {
        Long testId = 5L;
        user1.setId(testId);

        Assert.assertEquals(testId, user1.getId());

    }

    @Test
    public void getName() throws Exception {
        String testName = "Bambie Young";
        user1.setName(testName);

        assertEquals(testName, user1.getName());
    }

    @Test
    public void getUsername() throws Exception {
    }

    @Test
    public void getBalance() throws Exception {
    }

}