package com.zit.accounting.rpc.ispass;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by zhou on 2016/9/10.
 */
public class MqSendPassedTest {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setVirtualHost("javaHost");
        factory.setUsername("zhou");
        factory.setPassword("wen2");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World hahahahh!";
        for (int i = 0; i < 10; i++) {
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
            Thread.sleep(1000);
            System.out.println(" [x] Sent '" + i + " " + message + "'");

        }

        channel.close();
        connection.close();
    }
}
