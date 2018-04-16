package com.example.yrdemo.web.controller;

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

    @RequestMapping(method = RequestMethod.GET, params = "!q")
    public String textSearch(@RequestParam(value = "text", defaultValue = "") final String searchText,
                             final HttpServletRequest request, final Model model, final HttpServletResponse response)
    {
        List<Callable<CommandReturn>> commands = new LinkedList();
        commands.add(commandFactory.createNavigationCommand());
        commands.add(commandFactory.createTextSearchCommand(searchText));
        invoke(commands, model);
        return "pages/search/result";
    }
}
