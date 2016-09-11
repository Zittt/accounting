package com.zit.accounting.dao.test;

import com.zit.accounting.dao.domain.AccConsumeType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.zit.accounting.dao.mapper.AccConsumeTypeMapper;

public class AccConsumeTypeMapperTest extends BaseDaoTest{

	private static final Logger _LOG = LoggerFactory.getLogger(AccConsumeTypeMapperTest.class);

	@Autowired
	private AccConsumeTypeMapper accConsumeTypeMapper;

	@Test
	public void testSelectByPrimaryKey() {
		_LOG.info("###" + JSONObject.toJSONString(accConsumeTypeMapper.selectByPrimaryKey(2)));
		
	}
//
	@Test
	public void testInsert() {
		AccConsumeType acc = new AccConsumeType();
		acc.setTypeCode(8);
		acc.setTypeDesc("hahah");
		acc.setTypeName("fjaoisjfdaoijf");
		accConsumeTypeMapper.insert(acc);
		_LOG.info("###################id:" + acc.getAccConsumeTypeId());
	}
}
