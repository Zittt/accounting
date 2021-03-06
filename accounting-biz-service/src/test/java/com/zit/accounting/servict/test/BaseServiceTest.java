package com.zit.accounting.servict.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhou on 2016/9/10.
 */
@ActiveProfiles(value = "local")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={
        "classpath*:/spring/application-context.xml",
        "classpath*:/spring/spring-datasource.xml"
    })
public class BaseServiceTest {
}
