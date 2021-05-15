package com.hgh.utils;


import com.hgh.entity.dto.CommErrData;
import com.hgh.entity.dto.Result;

public class ResultUtil {


    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(CommErrData.SCU.getCode());
        result.setMsg(CommErrData.SCU.getMsg());
        result.setData(data);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static <T> Result<T> fail(T data) {
        Result<T> result = new Result<>();
        result.setCode(CommErrData.ERR.getCode());
        result.setMsg(CommErrData.ERR.getMsg());
        result.setData(data);
        return result;
    }

    public static Result fail(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
