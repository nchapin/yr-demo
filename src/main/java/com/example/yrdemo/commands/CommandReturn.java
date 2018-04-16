package com.example.yrdemo.commands;

public class CommandReturn {
    String code;
    Object value;

    public CommandReturn(String code, Object value) {
        super();
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
