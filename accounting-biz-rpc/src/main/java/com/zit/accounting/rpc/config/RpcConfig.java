package com.zit.accounting.rpc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhou on 2016/9/9.
 */
@Component
public class RpcConfig {

    @Value("${base.test1.queue}")
    private String test1Queue;

    @Value("${base.test1.exchange}")
    private String test1Exchange;

    @Value("${base.test1.routingkey}")
    private String test1Routingkey;


    public String getTest1Queue() {
        return test1Queue;
    }

    public void setTest1Exchange(String test1Exchange) {
        this.test1Exchange = test1Exchange;
    }

    public String getTest1Exchange() {
        return test1Exchange;
    }

    public void setTest1Queue(String test1Queue) {
        this.test1Queue = test1Queue;
    }

    public String getTest1Routingkey() {
        return test1Routingkey;
    }

    public void setTest1Routingkey(String test1Routingkey) {
        this.test1Routingkey = test1Routingkey;
    }
}
