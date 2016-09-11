package com.zit.accounting.rpc.producer.impl;

import com.zit.accounting.rpc.config.RpcConfig;
import com.zit.accounting.rpc.producer.IProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhou on 2016/9/9.
 */
@Service
public class Test1Producer implements IProducer{

    private static final Logger _LOG = LoggerFactory.getLogger(Test1Producer.class);

    @Autowired
    private RpcConfig rpcConfig;

    @Autowired
    private AmqpTemplate test1AmqpTemplate;

    @Override
    public void sendMessage(String params) {
        _LOG.info("发送队列消息开始...");
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setContentEncoding("UTF-8");
        messageProperties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
        messageProperties.setContentType(MessageProperties.CONTENT_TYPE_BYTES);
        byte[] s= params.getBytes();
        if(s != null) {
            messageProperties.setContentLength(s.length);
        }
        if(s.length !=0){
            test1AmqpTemplate.send(rpcConfig.getTest1Routingkey(), new Message(s, messageProperties));
            _LOG.info("【发送的消息数据为：{}】", params);
        }

    }
}
