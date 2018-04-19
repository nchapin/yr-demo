package com.example.yrdemo.web.controller;

import com.example.yrdemo.api.SearchQuery;
import com.example.yrdemo.commands.CommandFactory;
import com.example.yrdemo.commands.CommandReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("**/c")
public class CategoryController extends AbstractController {
    @Autowired
    CommandFactory commandFactory;

    @RequestMapping(value = "/{categoryCode:.*}", method = RequestMethod.GET)
    public String getCategory(@PathVariable("categoryCode") final String categoryCode,
                              @RequestParam(value = "q", required = false) final String searchQuery,
                              @RequestParam(value = "page", defaultValue = "0") final int page,
                              @RequestParam(value = "sort", required = false) final String sortCode,
                              final Model model,
                              final HttpServletRequest request,
                              final HttpServletResponse response) {
        SearchQuery query = new SearchQuery();
        query.setCategoryCode(categoryCode);
        query.setPage(page);
        query.setSort(sortCode);
        query.setQuery(searchQuery);
        List<Callable<CommandReturn>> commands = new LinkedList();
        commands.add(commandFactory.createNavigationCommand());
        commands.add(commandFactory.createCategoryNavigationCommand(query));
        invoke(commands, model);
        return "pages/category/plp";
    }
}
