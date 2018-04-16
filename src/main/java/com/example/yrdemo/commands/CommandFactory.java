package com.example.yrdemo.commands;

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
    public CategoryNavigationCommand createCategoryNavigationCommand(String categoryCode) {
        CategoryNavigationCommand command = new CategoryNavigationCommand();
        command.setCategoryCode(categoryCode);
        return command;
    }
}
