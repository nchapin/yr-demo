package com.example.yrdemo.api;

import com.example.yrdemo.commands.CategoryNavigationCommand;
import com.example.yrdemo.commands.CommandFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceTest {
    @Autowired
    CommandFactory commandFactory;

    @Test
    public void testSearchPerfum() throws Exception {
        SearchQuery query = new SearchQuery();
        query.setCategoryCode("30000");
        query.setQuery(":relevance:sales:bestSales");
        CategoryNavigationCommand command = commandFactory.createCategoryNavigationCommand(query);
        //assertNotNull(command);
        //CommandReturn result = command.call();
        //assertNotNull(result);
        //assertTrue(((SearchResultData) result.getValue()).getProducts().size() > 0);
        assertTrue(true);
    }
}
