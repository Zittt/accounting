package com.zit.accounting.rpc.producer;

/**
 * Created by zhou on 2016/9/9.
 */
public interface IProducer {

    /**
     * 往队列中放数据
     * @param params
     */
    public void sendMessage(String params);
}
