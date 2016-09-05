package com.zit.accounting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zit.accounting.dao.domain.AccConsumeType;
import com.zit.accounting.dao.mapper.AccConsumeTypeMapper;

@Service
public class AccConsumeTypeService {
	
	@Autowired
	private AccConsumeTypeMapper accConsumeTypeMapper;
	
	public AccConsumeType getAccConsumeTypeById(Integer accConsumeTypeId) {
		return accConsumeTypeMapper.selectByPrimaryKey(accConsumeTypeId);
	}
	
}
