package com.shieroj.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import static com.shieroj.constant.MqConstant.*;


/**
 * 用于创建测试程序用到的交换机和队列（只用在程序启动前执行一次）
 *
 * @author Shier
 */
@Slf4j
public class CodeMqInitMain {

    public static void doInitCodeMq() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            // todo 配置服务器信息
            factory.setHost("ssssss");
            factory.setPassword("ssssssss");
            factory.setUsername("sssss");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String codeExchangeName = CODE_EXCHANGE_NAME;
            channel.exchangeDeclare(codeExchangeName, CODE_DIRECT_EXCHANGE);

            // 创建 code 队列
            String codeQueue = CODE_QUEUE;
            Map<String, Object> codeMap = new HashMap<>();

            // code队列绑定死信交换机
            codeMap.put("x-dead-letter-exchange", CODE_DLX_EXCHANGE);
            codeMap.put("x-dead-letter-routing-key", CODE_DLX_ROUTING_KEY);
            channel.queueDeclare(codeQueue, true, false, false, codeMap);
            channel.queueBind(codeQueue, codeExchangeName, CODE_ROUTING_KEY);

            // 创建死信队列和死信交换机
            // 创建死信队列
            channel.queueDeclare(CODE_DLX_QUEUE, true, false, false, null);
            // 创建死信交换机
            channel.exchangeDeclare(CODE_DLX_EXCHANGE, CODE_DIRECT_EXCHANGE);
            channel.queueBind(CODE_DLX_QUEUE, CODE_DLX_EXCHANGE, CODE_DLX_ROUTING_KEY);

            log.info("消息队列启动成功！");
        } catch (Exception e) {
            log.error("消息队列启动失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        doInitCodeMq();
    }
}