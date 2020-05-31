package com.mercenaries.EasyApi.exception;

import com.mercenaries.EasyApi.dto.EasyApiError;

public abstract class EasyApiException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private final EasyApiError error;

    public EasyApiException() {
        super();
        this.error = new EasyApiError(null, null);
    }

    public EasyApiException(final String message, final Throwable cause) {
        super(message, cause);
        this.error = new EasyApiError(message, cause);
    }

    public EasyApiException(final String message) {
        this(message, message);
    }

    public EasyApiException(final String message, final Object detail){
        super(message);
        this.error = new EasyApiError(message, detail);
    }

    public EasyApiError getError(){
        return error;
    }

    @Override
    public String toString(){
        return String.format("EasyApiException [error=%s", error);
    }
}
