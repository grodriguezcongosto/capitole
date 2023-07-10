package com.capitole.test.exception;

public class PriceNotFoundException extends Exception {
    
    public static final String PRICE_NOT_FOUND = "Price not found";

    public PriceNotFoundException() {
        super(PRICE_NOT_FOUND);
    }
    public PriceNotFoundException(String message) {
        super(message);
    }    
}
