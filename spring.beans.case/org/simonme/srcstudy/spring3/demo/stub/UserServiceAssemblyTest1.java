/*
 * 文 件 名:  UserServiceAssemblyTest1.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年8月27日
 */
package org.simonme.srcstudy.spring3.demo.stub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.simonme.srcstudy.spring3.demo.service.UserService;
import org.simonme.srcstudy.spring3.demo.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年8月27日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserServiceAssemblyTest1
{
    
    @Test
    public void testOnlyAssembly()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService", UserService.class);
        assertEquals(UserServiceImpl.class, userService.getClass());
    }
    
}
