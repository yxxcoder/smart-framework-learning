package com.simple.smart.ioc.bean;

/**
 * 返回数据对象
 *
 * @author yxxcoder
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
