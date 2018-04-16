package com.example.yrdemo.commands;

import com.example.yrdemo.api.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TextSearchCommand extends AbstractCommand {
    String text;

    @Autowired
    SearchService searchService;
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public CommandReturn doInternalCall() throws Exception {
        return new CommandReturn("searchResult", searchService.textSearch(text));
    }

    @Override
    public String getCacheKey() {
        return "SearchData-" + text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }
}
