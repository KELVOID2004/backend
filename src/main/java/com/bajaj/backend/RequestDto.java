package com.bajaj.backend;

import java.util.ArrayList;
import java.util.List;

public class RequestDto {

    private List<String> data;

    public RequestDto() {
        data = new ArrayList<>();
    }

    public RequestDto(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
