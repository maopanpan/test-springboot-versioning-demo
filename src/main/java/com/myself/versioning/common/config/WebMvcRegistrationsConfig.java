package com.myself.versioning.common.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 类名称：WebMvcRegistrationsConfig <br>
 * 类描述：<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Configuration
public class WebMvcRegistrationsConfig implements WebMvcRegistrations {
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new VersionRequestMappingHandlerMapping();
    }
}
