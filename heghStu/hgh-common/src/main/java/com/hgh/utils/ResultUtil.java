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
    public static <T> Result<T> succ(T data) {
        Result<T> result = new Result<T>();
        result.setCode(CommErrData.SCU.getCode());
        result.setMsg(CommErrData.SCU.getMsg());
        result.setData(data);
        return result;
    }

    public static Result succ() {
        return succ(null);
    }

    public static Result fail(Object object) {
        Result result = new Result();
        result.setCode(10000);
        result.setMsg("fail");
        result.setData(object);
        return result;
    }

    public static Result fail(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
