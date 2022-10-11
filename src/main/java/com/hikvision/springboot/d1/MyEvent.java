package com.hikvision.springboot.d1;

import org.springframework.context.ApplicationEvent;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/10/11 10:14
 * @Version 1.0
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
