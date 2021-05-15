package com.hgh.entity.dto;


/**
 * CommErrData
 *
 * @author lf
 * @date 2021/5/15
 */
public enum  CommErrData {

    /**
     * 成功
     */
    SCU(0, "成功"),
    ERR(1, "失败")
    ;

    CommErrData(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
    private Integer code;
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
