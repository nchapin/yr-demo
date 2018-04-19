package com.example.yrdemo.web.controller;

import com.example.yrdemo.api.SearchQuery;
import com.example.yrdemo.commands.CommandFactory;
import com.example.yrdemo.commands.CommandReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("/search")
public class SearchController extends AbstractController {
    @Autowired
    CommandFactory commandFactory;

    @RequestMapping(method = RequestMethod.GET, params = "q")
    public String refineSearch(@RequestParam(value = "q") final String q,
                             @RequestParam(value = "page", defaultValue = "0") final int page,
                             @RequestParam(value = "sort", required = false) final String sortCode,
                             final HttpServletRequest request,
                             final Model model,
                             final HttpServletResponse response) {
        SearchQuery query = new SearchQuery();
        query.setQuery(q);
        query.setPage(page);
        query.setSort(sortCode);
        List<Callable<CommandReturn>> commands = new LinkedList();
        commands.add(commandFactory.createNavigationCommand());
        commands.add(commandFactory.createTextSearchCommand(query));
        invoke(commands, model);
        return "pages/search/result";
    }

    @RequestMapping(method = RequestMethod.GET, params = "!q")
    public String textSearch(@RequestParam(value = "text", defaultValue = "") final String searchText,
                             @RequestParam(value = "page", defaultValue = "0") final int page,
                             @RequestParam(value = "sort", required = false) final String sortCode,
                             final HttpServletRequest request,
                             final Model model,
                             final HttpServletResponse response) {
        SearchQuery query = new SearchQuery();
        query.setFreeText(searchText);
        query.setPage(page);
        query.setSort(sortCode);
        List<Callable<CommandReturn>> commands = new LinkedList();
        commands.add(commandFactory.createNavigationCommand());
        commands.add(commandFactory.createTextSearchCommand(query));
        invoke(commands, model);
        return "pages/search/result";
    }
}
