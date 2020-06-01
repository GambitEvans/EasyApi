package com.mercenaries.EasyApi.dto;

import com.mercenaries.EasyApi.enums.EasyApiHttpEnum;

import java.time.LocalDateTime;

public class EasyApiResponse<T> extends EasyApiDto {
    private static final long serialVersionUID = 1L;

    private LocalDateTime timestamp;
    private Integer nrStatus;
    private String message;
    private T data;

    public EasyApiResponse() {
        super();
    }

    public EasyApiResponse(final EasyApiHttpEnum status, final T dados) {
        super();
        this.timestamp = LocalDateTime.now();
        this.nrStatus = status.getStatus().value();
        this.message = status.getMessage();
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getNrStatus() {
        return nrStatus;
    }

    public void setNrStatus(Integer nrStatus) {
        this.nrStatus = nrStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("EasyApiResponse [timeStamp=%s, nrStatus=%s, data=%s,  txMensagem=%s]",
                timestamp, nrStatus, data, message);
    }
}
