/*
 * 文 件 名:  BeanAssemblyTest.java
 * 版    权:   .
 * 描    述:  <描述>
 * 修 改 人:  chen.simon
 * 修改时间:  2016-4-11
 */
package org.simonme.srcstudy.spring3.demo.service;

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
    
    /** <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceA serviceA = (ServiceA)applicationContext.getBean("serviceA", ServiceAImpl.class);
        System.out.println(serviceA);
        System.out.println(serviceA.queryA());
    }
    
}
