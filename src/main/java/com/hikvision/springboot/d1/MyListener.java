package com.hikvision.springboot.d1;

import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/10/11 10:16
 * @Version 1.0
 */
@Slf4j
@Component
public class MyListener {

    @EventListener(MyEvent.class)
    public void receive(Object obj) {
        log.info(obj.toString());
    }
}
