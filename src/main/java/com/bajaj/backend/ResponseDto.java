package com.bajaj.backend;

public class ResponseDto {

    private Integer operation_code;

    public ResponseDto(Integer operation_code) {
        this.operation_code = operation_code;
    }

    public Integer getOperation_code() {
        return operation_code;
    }

    public void setOperation_code(Integer operation_code) {
        this.operation_code = operation_code;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "operation_code=" + operation_code +
                '}';
    }
}
