package com.home.cards.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidApiParameterException extends RuntimeException {

    public InvalidApiParameterException(String message) {
        super(message);
    }
}
