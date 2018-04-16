package com.example.yrdemo.api;

import com.example.yrdemo.commands.CategoryNavigationCommand;
import com.example.yrdemo.commands.CommandFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceTest {
    @Autowired
    CommandFactory commandFactory;

    @Test
    public void testSearchPerfum() {
        CategoryNavigationCommand command = commandFactory.createCategoryNavigationCommand("20000");
        assertNotNull(command);
        assertNotNull(command.call());
    }
}
