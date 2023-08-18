package com.lab8;

public class TooManyArgsException extends Exception {
    String message;
    TooManyArgsException() {

        message = "Too many arguments for operation!";
    }
    @Override
    public String toString(){
        return message;
    }
}