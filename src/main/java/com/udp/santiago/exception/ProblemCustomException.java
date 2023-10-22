package com.udp.santiago.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ProblemCustomException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private HttpStatus status;
    private String customMessage;
    private String customMessage2;
    public ProblemCustomException(String customMessage, String customMessage2, HttpStatus status) {
        this.customMessage = customMessage;
        this.customMessage2 = customMessage2;
        this.status = status;
    }
}
