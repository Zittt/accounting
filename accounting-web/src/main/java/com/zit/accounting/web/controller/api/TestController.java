package com.zit.accounting.web.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zit.accounting.service.AccConsumeTypeService;

import net.minidev.json.JSONObject;

public class TestController {
	
	@Autowired
	private AccConsumeTypeService accConsumeTypeService;
	
	@ResponseBody
	@RequestMapping(value = "/getAccCosumeTypeById", method = RequestMethod.POST)
	public JSONObject getAccCosumeTypeById() {
		
		return null;
	}
	
}
