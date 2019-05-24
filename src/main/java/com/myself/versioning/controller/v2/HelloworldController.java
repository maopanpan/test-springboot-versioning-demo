package com.myself.versioning.controller.v2;

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
@Version(2)
@RequestMapping("/test/{version}")
@RestController("HelloworldController-v2")
public class HelloworldController {

    @GetMapping(value = "/sayHello")
    public String sayHello(String name) {
        return "Hello," + name + ". My name is V2";
    }
}
