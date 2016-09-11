package com.zit.accounting.web.controller.api;

import com.alibaba.fastjson.JSON;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Response;
import com.zit.accounting.dao.domain.AccConsumeType;
import com.zit.accounting.service.dto.ReceiveMqDto;
import com.zit.accounting.service.dto.SendMqResult;
import com.zit.accounting.service.mqService.SendMqMsgService;
import com.zit.accounting.web.help.JsonRPCBizHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zit.accounting.service.AccConsumeTypeService;

import net.minidev.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class TestController {

    private static final Logger _LOG = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private AccConsumeTypeService accConsumeTypeService;

    @Autowired
    private SendMqMsgService sendMqMsgService;
	
	@ResponseBody
	@RequestMapping(value = "/getAccCosumeTypeById", method = RequestMethod.POST)
	public JSONObject getAccCosumeTypeById(HttpServletRequest request, HttpServletResponse response) {
        _LOG.info("#######getAccConsumeTypeById进来了....");
	    String id = request.getParameter("id");
        _LOG.info("###id=" + id);
        AccConsumeType accConsumeType = accConsumeTypeService.getAccConsumeTypeById(Integer.valueOf(id));
	    _LOG.info("###result=" + com.alibaba.fastjson.JSONObject.toJSONString(accConsumeType));
        JSONRPC2Response jsonresp = new JSONRPC2Response(1);
        jsonresp.setResult(accConsumeType);
        return jsonresp.toJSONObject();
	}


	@ResponseBody
    @RequestMapping(value = "/testmq", method = RequestMethod.POST)
    public JSONObject sendMqMsg(HttpServletRequest request, HttpServletResponse response) {
        _LOG.info("################/testma进来了........");
        ReceiveMqDto receiveMqDto = JsonRPCBizHelper.getRequestDto(request, ReceiveMqDto.class);
        JSONRPC2Response jsonresp = new JSONRPC2Response(JsonRPCBizHelper.getForwardData(request).getID());
        _LOG.info(String.format("send mq start, receiveMqDto.toString [%s]", com.alibaba.fastjson.JSONObject.toJSON(receiveMqDto)));
        SendMqResult sendMqResult = sendMqMsgService.send(receiveMqDto.getParams().getData());
        jsonresp.setResult(sendMqResult);
        _LOG.info(String.format("send mq end, response is [%s]", jsonresp.toJSONObject().toJSONString()));
        return jsonresp.toJSONObject();
    }
	
}
