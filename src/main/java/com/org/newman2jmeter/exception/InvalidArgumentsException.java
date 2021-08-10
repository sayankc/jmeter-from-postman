package com.org.newman2jmeter.exception;

public class InvalidArgumentsException extends Exception {
    public InvalidArgumentsException() {
        super("Needs 2 args -- Postman collection json filepath and Jmx output file path!");
    }
}
