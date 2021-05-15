package com.hgh.utils;




public class ResultUtil {
    public static Result succ(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
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
