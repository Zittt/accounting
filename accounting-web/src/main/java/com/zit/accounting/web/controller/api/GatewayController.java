package com.zit.accounting.web.controller.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zit.accounting.web.help.JsonRPCBizHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thetransactioncompany.jsonrpc2.JSONRPC2Request;

/**
 * @author zhou 2016/08/22
 */
@Controller
public class GatewayController {

	private static final Logger _LOG = LoggerFactory.getLogger(GatewayController.class);

	private static final Map<String, String> methodProviderMap = new HashMap<String, String>();

	// 定义 JSONRPC2 中method 对应访问的controller
	static {
		methodProviderMap.put("service.getAccCosumeTypeById", "/getAccCosumeTypeById");

		methodProviderMap.put("mq.test", "/testmq");
	}
	
	
	
	@RequestMapping(value = "/gateway", method = RequestMethod.POST)
	public String gateway(Object obj, Model model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		JSONRPC2Request jsonrpc2req = JsonRPCBizHelper.setForwardData(request);
//		BizLogTracer.addLog(_LOG, BizLogTracer.BIZ_DIRECTION_IN, BizLogTracer.SYSTEM_NAME_ORDER, jsonrpc2req.toJSONObject() );
		String result ="";
		if (methodProviderMap.containsKey(jsonrpc2req.getMethod())) {
			request.setAttribute("jsonrpc2req", jsonrpc2req);
			result = "forward:" + methodProviderMap.get(jsonrpc2req.getMethod());
		} else {
			_LOG.error("#jsonrpc2req.getMethod()=" + jsonrpc2req.getMethod());
			throw new RuntimeException("no method was declared in json request.");
		}
		return result;
		
	}

}
