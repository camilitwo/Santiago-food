package com.udp.santiago.dto;

import lombok.Data;

@Data
public class GenericResponse {

    private String message;

    private boolean success;
    private Object data;

    public GenericResponse() {
    }

    public GenericResponse(String message, Object data, boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }
}
