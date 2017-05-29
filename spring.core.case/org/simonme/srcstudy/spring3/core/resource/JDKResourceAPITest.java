/*
 * 文 件 名:  JDKResourceAPITest.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年5月29日
 */
package org.simonme.srcstudy.spring3.core.resource;

import java.io.InputStream;
import java.net.URL;

import org.apache.commons.logging.impl.AvalonLogger;
import org.junit.Test;

/**
 * <一句话功能简述> 用JDK原生的API测试resource能力
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年5月29日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class JDKResourceAPITest
{
    
    @Test
    public void test001()
    {
        String fileName = "org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClass(fileName);
    }
    
    @Test
    public void test002()
    {
        String fileName = "../TestTemp.class";
        getResourceByClass(fileName);
    }
    
    @Test
    public void test003()
    {
        String fileName = "/org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClass(fileName);
    }
    
    @Test
    public void test004()
    {
        String fileName = "org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClass(fileName);
    }
    
    @Test
    public void test005()
    {
        String fileName = "/org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClass(fileName);
    }
    
    @Test
    public void test011()
    {
        String fileName = "org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClassLoader(fileName);
    }
    
    @Test
    public void test012()
    {
        String fileName = "../TestTemp.class";
        getResourceByClassLoader(fileName);
    }
    
    @Test
    public void test013()
    {
        String fileName = "/org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClassLoader(fileName);
    }
    
    @Test
    public void test014()
    {
        String fileName = "org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClassLoader(fileName);
    }
    
    @Test
    public void test015()
    {
        String fileName = "/org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClassLoader(fileName);
    }
    
    @Test
    public void test021()
    {
        String fileName = "org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClassInJar(fileName);
    }
    
    @Test
    public void test022()
    {
        String fileName = "../Log.class";
        getResourceByClassInJar(fileName);
    }
    
    @Test
    public void test023()
    {
        String fileName = "/org/simonme/srcstudy/spring3/core/resource/JDKResourceAPITest.class";
        getResourceByClassInJar(fileName);
    }
    
    @Test
    public void test024()
    {
        String fileName = "org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClassInJar(fileName);
    }
    
    @Test
    public void test025()
    {
        String fileName = "/org/apache/commons/logging/impl/AvalonLogger.class";
        getResourceByClassInJar(fileName);
    }

    /** <一句话功能简述>
     * <功能详细描述>
     * @param fileName
     * @see [类、类#方法、类#成员]
     */
    private void getResourceByClass(String fileName)
    {
        URL url = this.getClass().getResource(fileName);
        InputStream inputStream = this.getClass().getResourceAsStream(fileName);
        System.out.println(url);
        System.out.println(inputStream);
    }
    
    private void getResourceByClassLoader(String fileName)
    {
        URL url = this.getClass().getClassLoader().getResource(fileName);
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        System.out.println(url);
        System.out.println(inputStream);
    }
    
    private void getResourceByClassInJar(String fileName)
    {
        URL url = AvalonLogger.class.getResource(fileName);
        InputStream inputStream = AvalonLogger.class.getResourceAsStream(fileName);
        System.out.println(url);
        System.out.println(inputStream);
    }
    
}
