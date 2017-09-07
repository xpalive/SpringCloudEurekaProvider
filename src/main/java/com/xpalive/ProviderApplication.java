package com.xpalive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by xiongp on 2017/9/6.
 */
@EnableDiscoveryClient  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ProviderApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(ProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProviderApplication.class);
        app.run(args);
        LOGGER.info("系统启动完成");
    }
}
