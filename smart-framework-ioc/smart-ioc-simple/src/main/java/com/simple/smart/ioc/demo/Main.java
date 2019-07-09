package com.simple.smart.ioc.demo;

import com.simple.smart.ioc.helper.ClassHelper;

import java.util.concurrent.TimeUnit;

/**
 * @author
 * @since 2019-07-09 11:23 PM
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException, IllegalAccessException, InstantiationException {
        System.out.println(System.currentTimeMillis());
        System.out.println(ClassHelper.class.newInstance());
        TimeUnit.SECONDS.sleep(10L);
    }
}
