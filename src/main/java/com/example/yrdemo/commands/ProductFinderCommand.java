package com.example.yrdemo.commands;

import com.example.yrdemo.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
    public CommandReturn doInternalCall() throws Exception {
        return new CommandReturn("product", productService.getProductByCode(code));
    }

    @Override
    public String getCacheKey() {
        return "ProductData-" + code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
