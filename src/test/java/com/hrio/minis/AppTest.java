package com.hrio.minis;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testReadFromXml() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aservice = (AService) ctx.getBean("aservice");
        aservice.sayHello();
    }
}
