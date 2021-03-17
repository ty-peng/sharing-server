package com.typeng.sharing.common;

import com.typeng.sharing.constant.Status;

/**
 * 统一返回结果.
 *
 * @author ty-peng
 * @date 2021-03-16 19:13
 */
public class Result<T> {

    private int status;
    private String info;
    private T data;

    public Result(int status, String info) {
        this.status = status;
        this.info = info;
    }

    public Result(T data) {
        this.status = Status.SUCCESS;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public Result<T> setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Result<T> setInfo(String info) {
        this.info = info;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}
