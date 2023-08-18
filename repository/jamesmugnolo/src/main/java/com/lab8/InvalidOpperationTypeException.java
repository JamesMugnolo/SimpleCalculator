package com.lab8;

public class InvalidOpperationTypeException extends Exception {
    String message;

    InvalidOpperationTypeException() {
        message = "Invalid Operation! only addition and subtraction are allowed";
    }
    @Override
    public String toString(){
        return message;
    }
}