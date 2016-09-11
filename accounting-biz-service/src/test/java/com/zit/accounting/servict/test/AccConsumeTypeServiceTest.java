package com.zit.accounting.servict.test;

import com.alibaba.fastjson.JSONObject;
import com.zit.accounting.service.AccConsumeTypeService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhou on 2016/9/10.
 */
public class AccConsumeTypeServiceTest extends BaseServiceTest {

    private final static Logger _LOG = LoggerFactory.getLogger(AccConsumeTypeService.class);

    @Autowired
    private AccConsumeTypeService accConsumeTypeService;

    @Test
    public void testService() {
        _LOG.info("###result:={}", JSONObject.toJSONString(accConsumeTypeService.getAccConsumeTypeById(2)));
    }
}
