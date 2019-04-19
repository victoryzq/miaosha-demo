package com.zq.miaosha.entity;

import lombok.Data;

@Data
public class CodeMsg {

    private int code;
    private String msg;


    public static CodeMsg SUCCESS=new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR=new CodeMsg(50001,"服务器连接失败");

    private CodeMsg(int code,String msg){
        this.code=code;
        this.msg=msg;

    }
}
