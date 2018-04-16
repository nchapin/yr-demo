package com.example.yrdemo.web.controller;

import com.example.yrdemo.commands.CommandReturn;
import org.springframework.ui.Model;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public abstract class AbstractController {
    static final ForkJoinPool mainPool = new ForkJoinPool();

    protected void invoke(List<Callable<CommandReturn>> commands, Model model) {
        List<Future<CommandReturn>> results = mainPool.invokeAll(commands);
        for(Future<CommandReturn> result : results) {
            try {
                CommandReturn value = result.get();
                model.addAttribute(value.getCode(), value.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
