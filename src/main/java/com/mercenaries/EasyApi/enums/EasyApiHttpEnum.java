package com.mercenaries.EasyApi.enums;

import com.mercenaries.EasyApi.util.EasyApiConstants;
import org.springframework.http.HttpStatus;

public enum EasyApiHttpEnum {

    HTTP_200(HttpStatus.OK, EasyApiConstants.RESPONSE_200),
    HTTP_201(HttpStatus.CREATED, EasyApiConstants.RESPONSE_201),
    HTTP_204(HttpStatus.OK, EasyApiConstants.RESPONSE_204),
    HTTP_304(HttpStatus.NOT_MODIFIED, EasyApiConstants.RESPONSE_304),
    HTTP_400(HttpStatus.BAD_REQUEST, EasyApiConstants.RESPONSE_400),
    HTTP_401(HttpStatus.UNAUTHORIZED, EasyApiConstants.RESPONSE_401),
    HTTP_404(HttpStatus.NOT_FOUND, EasyApiConstants.RESPONSE_404),
    HTTP_500(HttpStatus.INTERNAL_SERVER_ERROR, EasyApiConstants.RESPONSE_500);

    private HttpStatus status;
    private String message;

    EasyApiHttpEnum(final HttpStatus status, final String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
