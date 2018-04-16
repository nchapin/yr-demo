package com.example.yrdemo.web.controller;

import com.example.yrdemo.commands.CommandFactory;
import com.example.yrdemo.commands.CommandReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class DefaultController extends AbstractController {
    @Autowired
    CommandFactory commandFactory;

    @RequestMapping("/")
    public String get(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
        List<Callable<CommandReturn>> commands = new LinkedList();
        commands.add(commandFactory.createNavigationCommand());
        invoke(commands, model);
        return "pages/landing/homepage";
    }
}
