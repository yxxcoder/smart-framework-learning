package com.simple.smart.ioc;


import com.simple.smart.ioc.helper.BeanHelper;
import com.simple.smart.ioc.helper.ClassHelper;
import com.simple.smart.ioc.helper.ControllerHelper;
import com.simple.smart.ioc.helper.IocHelper;
import com.simple.smart.ioc.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @author yxxcoder
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
            ClassHelper.class,
            BeanHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}