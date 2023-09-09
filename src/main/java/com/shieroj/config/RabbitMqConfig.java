package com.shieroj.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shier
 * 获取RabbitMQ配置信息
 * @createTime 2023/8/24 星期四 14:53
 */
@Data
@Configuration
@Slf4j
public class RabbitMqConfig implements InitializingBean {
    /**
     * MQ ip地址
     */
    public static String MQ_HOST;

    /**
     * MQ 用户名
     */
    public static String MQ_USERNAME;

    /**
     * MQ 密码
     */
    public static String MQ_PASSWORD;

    @Value("${spring.rabbitmq.host}")
    private String host;
    @Value("${spring.rabbitmq.username}")
    private String userName;
    @Value("${spring.rabbitmq.password}")
    private String password;

    @Override
    public void afterPropertiesSet() throws Exception {
        MQ_HOST = this.host;
        MQ_PASSWORD = this.userName;
        MQ_USERNAME = this.password;
    }
}
