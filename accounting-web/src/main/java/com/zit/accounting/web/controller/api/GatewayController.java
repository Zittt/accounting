package com.zit.accounting.web.controller.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thetransactioncompany.jsonrpc2.JSONRPC2Request;
import com.zit.accounting.helper.JsonRPCBizHelper;

/**
 * @author zhou 2016/08/22
 */
@Controller
public class GatewayController {

	private static final Logger _LOG = LoggerFactory.getLogger(GatewayController.class);

	private static final Map<String, String> methodProviderMap = new HashMap<String, String>();

	// 定义 JSONRPC2 中method 对应访问的controller
	static {
		methodProviderMap.put("trade.stock.queryStock", "/queryStock");
		methodProviderMap.put("trade.stock.booking", "/booking");
		methodProviderMap.put("trade.stock.cancel", "/cancel");
		methodProviderMap.put("trade.stock.report", "/report");
		// ====add by luqingsong======
		methodProviderMap.put("trade.stock.payStockBySuccess", "/payStockBySuccess");
		methodProviderMap.put("trade.stock.payStockByFail", "/payStockByFail");
		methodProviderMap.put("trade.stock.addProductStock", "/addProductStock");

		methodProviderMap.put("trade.stock.fundComfirmStock", "/fundComfirmStock");
		methodProviderMap.put("trade.stock.addStock", "/addStock");
		methodProviderMap.put("trade.stock.updateStock", "/updateStock");
	}
	
	
	
	@RequestMapping(value = "gateway", method = RequestMethod.POST)
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
		
		/*if(jsonrpc2req.getMethod().indexOf(secInsurant)!=-1){
			request.setAttribute("jsonrpc2req", jsonrpc2req);
			result = "forward:"+secInsurantURL;
		}else if(jsonrpc2req.getMethod().indexOf(touInsurant)!=-1){
			request.setAttribute("jsonrpc2req", jsonrpc2req);
			result = "forward:"+touInsurantURL;
		}else if(jsonrpc2req.getMethod().indexOf(csLifeInsurant)!=-1){
			request.setAttribute("jsonrpc2req", jsonrpc2req);
			result = "forward:"+csLifeInsurantURL;
		}else if(StringUtils.isNotBlank(methodProviderMap.get(jsonrpc2req.getMethod()))){
			request.setAttribute("jsonrpc2req", jsonrpc2req);
			result = "forward:" + methodProviderMap.get(jsonrpc2req.getMethod());
		}else {
			_LOG.error("#jsonrpc2req.getMethod()=" + jsonrpc2req.getMethod());
			throw new RuntimeException("...");
		}*/
	}

}
