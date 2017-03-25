package com.abinge.law.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  2017/3/22 14:22.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
public class Result<T> implements Serializable{
    private static final long serialVersionUID = -208717068149179996L;

    private int rc;//返回码

    private T ret;//正确时的返回结果

    private String err;//失败时的异常信息

    private Result() {
    }

    private Result(int rc, String err) {
        this(rc, null, err);
    }

    private Result(int rc, T ret) {
        this(rc, ret, null);
    }

    private Result(int rc, T ret, String err) {
        this.rc = rc;
        this.ret = ret;
        this.err = err;
    }

    public final static int SUCCESS = 0;
    public final static int FAILD = 1;

    public static Result<?> newFalid() {
        return newResult(FAILD, null, null);
    }

    public static Result<?> newFalid(String err) {
        return newResult(FAILD, null, err);
    }

    public static Result<?> newFalid(int rc, String err) {
        return newResult(rc, null, err);
    }

    public static <T> Result<T> newSuccess() {
        return newResult(SUCCESS, null, null);
    }

    public static <T> Result<T> newSuccess(T t) {
        return newResult(SUCCESS, t, null);
    }

    private static <T> Result<T> newResult(int rc, T t, String err) {
        return new Result<T>(rc, t, err);
    }

    @JsonIgnore
    public boolean isSuccess() {
        return rc == SUCCESS;
    }

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public String getErr() {
        return this.err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public T getRet() {
        return ret;
    }

    public void setRet(T ret) {
        this.ret = ret;
    }
}
