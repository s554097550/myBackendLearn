package com.example.domain;

/**
 * Created by Siwde on 2017/4/11.
 */
public class Result<T> {//泛型搞清楚
    /**
     * 泛型的通配符包括T,E,K,V,?
     * 使用大写字母A,B,C,D......X,Y,Z定义的，就都是泛型，把T换成A也一样，这里T只是名字上的意义而已
        ？ 表示不确定的java类型
        T (type) 表示具体的一个java类型
        K V (key value) 分别代表java键值中的Key Value
        E (element) 代表Element

        这篇文章很不错 http://www.jianshu.com/p/95f349258afb
     */
    //返回码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

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
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
