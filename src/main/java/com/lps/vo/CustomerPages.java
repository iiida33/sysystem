package com.lps.vo;

import com.lps.po.Customer;

import java.util.List;

/**
 * @ClassName: CustomerPages
 * @Description:
 * @Author: 梁培珊
 * @Date: 15:11 2019/4/13
 **/
public class CustomerPages {
    Integer code;
    String msg;
    Integer count;
    List<Customer> data;

    @Override
    public String toString() {
        return "CustomerPages{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Customer> getData() {
        return data;
    }

    public void setData(List<Customer> data) {
        this.data = data;
    }
}
