package com.udp.santiago.exception;

import com.udp.santiago.dto.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProblemCustomException.class)
    @ResponseStatus(HttpStatus.OK)
    public GenericResponse handleProblemCustomException(ProblemCustomException ex) {
        ex.printStackTrace();
        return new GenericResponse(ex.getCustomMessage(), ex.getCustomMessage2(), Boolean.FALSE);
    }
}
