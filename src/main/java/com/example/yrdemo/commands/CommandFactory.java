package com.example.yrdemo.commands;

import com.example.yrdemo.api.SearchQuery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CommandFactory {
    @Bean
    @Scope("prototype")
    public NavigationCommand createNavigationCommand() {
       return new NavigationCommand();
    }

    @Bean
    @Scope("prototype")
    public CategoryNavigationCommand createCategoryNavigationCommand(SearchQuery query) {
        CategoryNavigationCommand command = new CategoryNavigationCommand();
        command.setQuery(query);
        return command;
    }

    @Bean
    @Scope("prototype")
    public ProductFinderCommand createProductFinderCommand(String code) {
        ProductFinderCommand command = new ProductFinderCommand();
        command.setCode(code);
        return command;
    }

    @Bean
    @Scope("prototype")
    public TextSearchCommand createTextSearchCommand(SearchQuery query) {
        TextSearchCommand command = new TextSearchCommand();
        command.setQuery(query);
        return command;
    }
}
