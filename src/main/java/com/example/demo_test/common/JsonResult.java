package com.example.demo_test.common;/**
 * @author yonrun
 * @Title: JsonResult
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 20:44
 */

import lombok.Data;

/**
 * @author
 * @description
 * @date 2019/10/8
 */
@Data
public class JsonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public void success(){
        this.code=200;
        this.msg="success";
    }

    public void fail(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public void success(T data){
        this.code=200;
        this.msg="success";
        this.data=data;
    }

    public void fail(){
        this.code=400;
        this.msg="fail";
    }

    public void fail(String msg){
        this.code=400;
        this.msg=msg;
    }


}
