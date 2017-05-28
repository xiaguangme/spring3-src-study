/*
 * 文 件 名:  BeanAssemblyTest.java
 * 版    权:   .
 * 描    述:  <描述>
 * 修 改 人:  chen.simon
 * 修改时间:  2016-4-11
 */
package org.simonme.srcstudy.spring3.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.simonme.srcstudy.spring3.demo.service.impl.ServiceAImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * <一句话功能简述> 组装bean测试
 * <功能详细描述>
 * 
 * @author  Chenxiaguang
 * @version  [版本号, 2016-4-11]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class BeanAssemblyTest
{
    
    /** <一句话功能简述> 最最简单的bean组装测试
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    @Test
    public void testOnlyAssembly()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceA serviceA = (ServiceA)applicationContext.getBean("serviceA", ServiceAImpl.class);
        assertEquals(ServiceAImpl.class, serviceA.getClass());
    }
    
    /**
     * <一句话功能简述> 测试xml路径上带占位符的
     * <功能详细描述>
     * @see [类、类#方法、类#成员]
     */
    @Test
    public void testXmlPathWithPlcaerHolder()
    {
        System.setProperty("test_key", "test");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-${test_key}.xml");
        ServiceAImpl serviceA = (ServiceAImpl)applicationContext.getBean("serviceA", ServiceAImpl.class);
        assertEquals("field4AInstacne占位符", serviceA.getField());
    }
    
}
