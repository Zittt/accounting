package com.zit.accounting.dao.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.zit.accounting.dao.mapper.AccConsumeTypeMapper;

public class AccConsumeTypeMapperTest extends BaseDaoTest{
	
	@Autowired
	private AccConsumeTypeMapper accConsumeTypeMapper;
	
	private static final Logger _LOG = LoggerFactory.getLogger(AccConsumeTypeMapperTest.class);
	
	@Test
	public void testSelectByPrimaryKey() {
		_LOG.info("###" + JSONObject.toJSONString(accConsumeTypeMapper.selectByPrimaryKey(2)));
		
	}
	
}
