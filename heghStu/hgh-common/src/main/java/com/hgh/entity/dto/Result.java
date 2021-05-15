package com.hgh.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Result<T> {

    /**
     * code
     * 0:成功
     * 非0：失败
     */
    @ApiModelProperty("0:成功,非0:失败")
    private Integer code;

    /**
     * 返回消息
     */
    @ApiModelProperty("返回消息")
    private String msg;

    /**
     * 数据载体
     */
    @ApiModelProperty("数据载体")
    private T data;


    public Result() {
        this.code = CommErrData.SCU.getCode();
        this.msg = CommErrData.SCU.getMsg();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
