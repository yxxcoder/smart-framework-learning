package com.simple.smart.ioc.bean;

import com.simple.smart.ioc.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author yxxcoder
 */
public class Param {

    private Map<String, Object> paramsMap;

    public Param(Map<String, Object> paramsMap) {
        this.paramsMap = paramsMap;
    }

    /**
     * 根据参数名获取 long 型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramsMap.get(name));
    }

    /**
     * 获取所有字段信息
     */
    public Map<String, Object> getMap() {
        return paramsMap;
    }

}
