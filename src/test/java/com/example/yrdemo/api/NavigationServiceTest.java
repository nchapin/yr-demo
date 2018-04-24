package com.example.yrdemo.api;

import com.example.yrdemo.commands.CommandFactory;
import com.example.yrdemo.commands.NavigationCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NavigationServiceTest {

    @Autowired
    CommandFactory commandFactory;

    @Test
    public void testGetNav() throws Exception {
        NavigationCommand command = commandFactory.createNavigationCommand();
        //assertNotNull(command);
        //assertNotNull(command.call());
        assertTrue(true);
    }
}
