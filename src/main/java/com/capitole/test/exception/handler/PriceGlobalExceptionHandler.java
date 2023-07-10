package com.capitole.test.exception.handler;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capitole.test.exception.PriceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class PriceGlobalExceptionHandler {
    
    @ExceptionHandler(PriceNotFoundException.class)
    public ResponseEntity<Object> handlePriceNotFoundException(final PriceNotFoundException e, final HttpServletRequest req) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(buildErrorInfo(req, "Price not found."));
    }

    private ErrorInfo buildErrorInfo(final HttpServletRequest request, final String message) {

        String path = new String();
        String method = new String();

        if (Objects.nonNull(request)) {
            path = request.getRequestURI();
            method = request.getMethod();
        }

        return ErrorInfo.builder().message(message).date(LocalDateTime.now().toString())
                .path(path).method(method).build();
    }
}
