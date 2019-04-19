package com.zq.miaosha.result;

import com.zq.miaosha.entity.CodeMsg;
import lombok.Data;

@Data
public class Result <T>{

    private int code;
    private String msg;
    private T data;

    private Result(T data){
        this.code=0;
        this.msg="success";
        this.data=data;

    }

    private Result(CodeMsg codeMsg){
        this.code=codeMsg.getCode();
        this.msg=codeMsg.getMsg();
    }

    /**
     * 请求成功时的响应
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result <T> success(T data){
        return new Result(data);

    }

    /**
     * 请求失败时的响应
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<>(codeMsg);

    }

}
