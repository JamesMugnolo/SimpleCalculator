package com.lab8;

public class TooFewArgsException extends Exception {
    String message;
    TooFewArgsException() {
        message = "Too few arguments for expression!";
    }
    @Override
    public String toString(){
        return message;
    }
}