package com.zit.accounting.rpc.consumer;

import com.zit.accounting.rpc.config.RpcConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhou on 2016/9/10.
 */
@Service
public class Test1QueueListener implements MessageListener {

    private Logger _LOG = LoggerFactory.getLogger(Test1QueueListener.class);


    @Autowired
    private RpcConfig rpcConfig;

    @Autowired
    private AmqpTemplate test1AmqpTemplate;

    @Override
    public void onMessage(Message message) {
        _LOG.info("1###监听器监听到数据...");

        try {
            // 解析数据
            String str = new String(message.getBody(), "UTF-8");
            _LOG.info("【1#监听到队列的数据为】:" + str);

            sendMessage(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sendMessage(String params) {
        _LOG.info("listener1发送队列消息开始...");
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setContentEncoding("UTF-8");
        messageProperties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
        messageProperties.setContentType(MessageProperties.CONTENT_TYPE_BYTES);
        byte[] s= params.getBytes();
        if(s != null) {
            messageProperties.setContentLength(s.length);
        }
        if(s.length !=0){
            test1AmqpTemplate.send(rpcConfig.getTest2Routingkey(), new Message(s, messageProperties));
            _LOG.info("【发送的消息数据为：{}】", params);
        }

    }
}
