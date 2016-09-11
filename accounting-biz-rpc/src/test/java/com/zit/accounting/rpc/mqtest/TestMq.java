package com.zit.accounting.rpc.mqtest;

import com.zit.accounting.rpc.BaseRpcTest;
import com.zit.accounting.rpc.producer.impl.Test1Producer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zwj on 2016/9/8.
 */
public class TestMq extends BaseRpcTest {

    private final static Logger _LOG = LoggerFactory.getLogger(TestMq.class);

    @Autowired
    private Test1Producer test1Producer;

    @Test
    public void test11() {
        _LOG.info("### 发送消息-开始。。。");
        test1Producer.sendMessage("这是测试用的message...");
        _LOG.info("### 发送消息-结束。。。");
        try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            _LOG.error("Thread.sleep throwed an exception.");
            e.printStackTrace();
        }
    }
}
