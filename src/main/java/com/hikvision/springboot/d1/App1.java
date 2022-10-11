package com.hikvision.springboot.d1;

import com.hikvision.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Locale;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/10/11 8:59
 * @Version 1.0
 */
@SpringBootApplication
public class App1 {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // MessageSource
        String zh = context.getMessage("h1", null, Locale.CHINESE);
        System.out.println(zh);
        String en = context.getMessage("h1", null, Locale.ENGLISH);
        System.out.println(en);

        // ResourceLoader
        Resource[] resources = context.getResources("classpath*:META-INF/spring.factories");
        for (Resource resource : resources) {
            System.out.println(resource.getURL());
        }

        // EnvironmentCapable
        String java_home = context.getEnvironment().getProperty("JAVA_HOME");
        System.out.println(java_home);

        // ApplicationEventPublisher
        context.publishEvent(new MyEvent(context));
    }
}
