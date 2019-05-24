package com.myself.versioning.controller.v3;

import com.myself.versioning.common.annotation.Version;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：HelloworldController<br>
 * 类描述：<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RequestMapping("/test")
@RestController("HelloworldController-v3")
public class HelloworldController {

    @Version(3)
    @GetMapping(value = "/{version}/sayHello")
    public String sayHello(String name) {
        return "Hello," + name;
    }

    @Version(4)
    @GetMapping(value = "/{version}/sayHello")
    public String sayHello1(String name) {
        return "Hello," + name;
    }
}
