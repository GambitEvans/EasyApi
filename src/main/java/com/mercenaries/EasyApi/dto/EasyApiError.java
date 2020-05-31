package com.mercenaries.EasyApi.dto;

public class EasyApiError extends EasyApiDto {
    private static final long serialVersionUID = 737697641750503481L;

    private String message;
    private transient Object detail;

    public EasyApiError(){
        this(null, null);
    }

    public EasyApiError(final String message, final Object detail) {
        super();
        this.message = message;
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public Object getDetail() {
        return detail;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    @Override
    public String toString(){
        return String.format("EasyApiErro [message= %s, detail=%s]", message, detail);
    }
}
