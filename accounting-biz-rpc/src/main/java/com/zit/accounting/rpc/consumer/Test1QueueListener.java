package com.zit.accounting.rpc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Created by zhou on 2016/9/10.
 */
@Service
public class Test1QueueListener implements MessageListener {

    private Logger _LOG = LoggerFactory.getLogger(Test1QueueListener.class);

    @Override
    public void onMessage(Message message) {
        _LOG.info("监听器监听到数据...");

        try {
            // 解析数据
            String str = new String(message.getBody(), "UTF-8");
            _LOG.info("【监听到队列的数据】:" + str);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
