package com.example.yrdemo.commands;

import com.example.yrdemo.api.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CategoryNavigationCommand extends AbstractCommand{
    String categoryCode;

    @Autowired
    SearchService searchService;

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    public CommandReturn doInternalCall() {
        return new CommandReturn("searchResult", searchService.searchByCategoryCode(categoryCode));
    }

    @Override
    public String getCacheKey() {
        return "CategorySearchData-" + categoryCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
