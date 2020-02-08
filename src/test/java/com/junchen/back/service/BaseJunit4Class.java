package com.junchen.back.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/applicationContext-dao.xml","classpath*:spring/applicationContext-service.xml","classpath*:spring/applicationContext-tx.xml"})
public class BaseJunit4Class {

}
