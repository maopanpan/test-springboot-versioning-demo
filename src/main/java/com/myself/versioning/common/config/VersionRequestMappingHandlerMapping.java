package com.myself.versioning.common.config;

import com.myself.versioning.common.annotation.Version;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * 类名称：VersionRequestMappingHandlerMapping<br>
 * 类描述：<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class VersionRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
    @Override
    protected RequestCondition<?> getCustomTypeCondition(Class<?> handlerType) {
        //return super.getCustomTypeCondition(handlerType);
        Version version = AnnotationUtils.findAnnotation(handlerType, Version.class);
        return createCondition(version);
    }

    @Override
    protected RequestCondition<?> getCustomMethodCondition(Method method) {
        Version version = AnnotationUtils.findAnnotation(method, Version.class);
        return createCondition(version);
        //return super.getCustomMethodCondition(method);
    }

    private RequestCondition<VersionRequestCondition> createCondition(Version version) {
        return version == null ? null : new VersionRequestCondition(version.value());
    }
}
