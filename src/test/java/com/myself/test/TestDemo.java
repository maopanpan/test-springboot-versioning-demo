package com.myself.test;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * 类名称：TestDemo<br>
 * 类描述：<br>
 * 创建时间：2019年05月24日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class TestDemo {

    public static void main(String[] args) {
        String name = "@@@@";
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("abc");
            }
        };
        Optional.ofNullable(name).ifPresent(consumer);
    }
}
