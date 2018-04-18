package com.example.yrdemo.commands;

import com.example.yrdemo.api.SearchQuery;
import com.example.yrdemo.api.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CategoryNavigationCommand extends AbstractCommand{
    SearchQuery query;

    @Autowired
    SearchService searchService;

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    public CommandReturn doInternalCall() {
        return new CommandReturn("searchResult", searchService.searchByCategoryCode(query));
    }

    @Override
    public String getCacheKey() {
        return "CategorySearchData-" + query.toString();
    }

    public SearchQuery getQuery() {
        return query;
    }

    public void setQuery(SearchQuery query) {
        this.query = query;
    }

    public SearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }
}
