package com.zit.accounting.service.mqService;

import com.zit.accounting.rpc.producer.IProducer;
import com.zit.accounting.service.dto.SendMqResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhou on 2016/9/10.
 */
@Service
public class SendMqMsgService {

    @Autowired
    private IProducer test1Producer;

    public SendMqResult send(String data) {
        test1Producer.sendMessage(data);
        SendMqResult sendMqResult = new SendMqResult();
        sendMqResult.setCode(101);
        sendMqResult.setDescription("成功发送");
        return sendMqResult;
    }

}
