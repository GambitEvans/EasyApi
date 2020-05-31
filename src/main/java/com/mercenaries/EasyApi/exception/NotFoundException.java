package com.mercenaries.EasyApi.exception;

public class NotFoundException extends EasyApiException{
    private static final long serialVersionUID = 1L;

    // Don't forget to extract this string to a dictionary of constants.
    private static final String RESPONSE_204 = "Operação realizada com sucesso, mas não retornou conteúdo";

    public NotFoundException(){

        getError().setMessage(RESPONSE_204);
        getError().setDetail(null);
    }

    public NotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final Object detail) {
        super(RESPONSE_204, detail);
    }

    public NotFoundException(final Throwable cause) {
        super(RESPONSE_204, cause);
    }

    public NotFoundException(final String message, final Object detail) {
        super(message, detail);
    }
}
