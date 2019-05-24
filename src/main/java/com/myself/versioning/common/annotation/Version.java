package com.myself.versioning.common.annotation;

import java.lang.annotation.*;

/**
 * 类名称：Version<br>
 * 类描述：API版本控制注解<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Version {
    /**
     * 版本号
     *
     * @return
     */
    int value();
}
