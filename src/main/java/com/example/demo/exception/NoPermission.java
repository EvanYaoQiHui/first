package com.example.demo.exception;

/**
 * @Author:Evan
 * @Date:2018/8/1 $time$
 * @Describe：$describe$
 * @Return:$returns$
 * @Param:$params$
 */
public class NoPermission extends Exception{
    /**
     * 自定义异常
     */
    private static final long serialVersionUID=1L;
    public NoPermission(String msg){
        super(msg);
    }
}
