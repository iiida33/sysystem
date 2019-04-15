package com.lps.vo;

import java.util.List;

/**
 * @ClassName: GoodPages
 * @Description:
 * @Author: 梁培珊
 * @Date:
 **/
public class GoodPages {
    Integer code;
    String msg;
    Integer count;
    List<GoodCatSku> data;

    @Override
    public String toString() {
        return "GoodPages{" +
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

    public List<GoodCatSku> getData() {
        return data;
    }

    public void setData(List<GoodCatSku> data) {
        this.data = data;
    }
}
