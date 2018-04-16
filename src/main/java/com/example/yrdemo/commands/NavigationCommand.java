package com.example.yrdemo.commands;

import com.example.yrdemo.api.NavigationService;
import com.example.yrdemo.api.data.CatalogViewData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NavigationCommand extends AbstractCommand {
    @Autowired
    NavigationService navigationService;

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    public CommandReturn call() {
        CatalogViewData data = navigationService.getCatalogView();
        return new CommandReturn("catalogView", data);
    }
}
