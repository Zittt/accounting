package com.zit.accounting.helper;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Request;

public class JsonRPCBizHelper {

	private static final Logger _LOG = LoggerFactory.getLogger(JsonRPCBizHelper.class);

	private static final String FORWARD_DATA_FLAG = "jsonrpc2req";

	public static final JSONRPC2Request setForwardData(HttpServletRequest request) throws Exception {
		JSONRPC2Request jsonrpc2req = convertFromBody(request);
		request.setAttribute("jsonrpc2req", jsonrpc2req);
		return jsonrpc2req;
	}

	public static final JSONRPC2Request getForwardData(HttpServletRequest request) {
		JSONRPC2Request jsonrpc2req = (JSONRPC2Request) request.getAttribute(FORWARD_DATA_FLAG);
		return jsonrpc2req;
	}
	
	/**
	 * 将request里面的json直接转换成相应service的输入参数
	 * @param request 
	 * @param classOfT
	 * @return
	 * 
	 * @author luqingsong
	 */
	public static final <T> T getRequestDto(HttpServletRequest request,Class<T> classOfT){
//		return null;
		return new Gson().fromJson(getForwardData(request).toJSONString(), classOfT);
	}

	/*public static final <T> T getForwardDataDealWithCamel(JSONRPC2Request jsonrpc2req, Class<T> clazz) throws Exception {
		// JSONRPC2Request jsonrpc2req = getForwardData(request);
		Map<String, Object> rawParams = jsonrpc2req.getNamedParams();
		Map<String, Object> camelParams = new HashMap<String, Object>(rawParams.size());
		for (Entry<String, Object> entry : rawParams.entrySet()) {
			String key = entry.getKey();
			Object val = entry.getValue();
			camelParams.put(CamelUtils.camelName(key), val);
		}

		T t = BeanInitialUtils.initWithDefalutValue(clazz);
		BeanUtils.populate(t, camelParams);
		return t;
	}*/

	private static final JSONRPC2Request convertFromBody(HttpServletRequest request) throws Exception{
		JSONRPC2Request jsonrpc2req = null;
		
			String body = getRequestBody(request);
			_LOG.info("########################### RequestBody=" + body);
			jsonrpc2req = JSONRPC2Request.parse(body);
		
		if (jsonrpc2req == null) {
			throw new RuntimeException("jsonrpc2req == null!");
		}

		return jsonrpc2req;
	}

	/**
	 * 从request中抓取body信息
	 * @param request
	 * @return
	 * @throws IOException
	 */
	public static final String getRequestBody(HttpServletRequest request) throws IOException {
		// 相应的实体消息内容的读取
		BufferedReader reader = request.getReader();

		StringBuilder sb = new StringBuilder();
		List<String> readLines = IOUtils.readLines(reader);
		if (readLines != null && readLines.size() > 0) {
			for (String content : readLines) {
				sb.append(content);
			}
		}
		reader.close();
		return sb.toString();
	}

}

