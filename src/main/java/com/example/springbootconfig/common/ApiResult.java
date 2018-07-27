package com.example.springbootconfig.common;

import java.util.Map;

public class ApiResult {
    private static  final long ERROR_CODE=1;
    private static  final long SUCCESS_CODE=0;
    private Long code;
    private String msg;
    private Map data;

    public ApiResult(){

    }

    public ApiResult(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
