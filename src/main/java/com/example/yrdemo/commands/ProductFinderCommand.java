package com.example.yrdemo.commands;

import com.example.yrdemo.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductFinderCommand extends AbstractCommand {
    String code;

    @Autowired
    ProductService productService;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public CommandReturn call() throws Exception {
        return new CommandReturn("product", productService.getProductByCode(code));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
