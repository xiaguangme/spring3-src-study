/*
 * 文 件 名:  PathMatchingResourcePatternResolverTest.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年5月28日
 */
package org.simonme.srcstudy.spring3.core.resource;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年5月28日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class PathMatchingResourcePatternResolverTest
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
    
    private void getResourceByClass(String fileName)
    {
        PathMatchingResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        Resource resource = loader.getResource(fileName);
        try
        {
            System.out.println(resource.getClass());
            System.out.println(resource.getURL());
        }
        catch (IOException e)
        {
            System.out.println("异常");
        }
        try
        {
            System.out.println(resource.getInputStream());
        }
        catch (IOException e)
        {
            System.out.println("异常");
        }
        System.out.println("------");
    }
    
    @Test
    public void test011()
    {
        String fileName = "classpath:**/*Test.class";
        getResourcesByClass(fileName);
    }
    
    private void getResourcesByClass(String fileName)
    {
        PathMatchingResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        Resource[] resources = null;
        try
        {
            resources = loader.getResources(fileName);
            for (Resource resource : resources)
            {
                System.out.println(resource.getClass());
                System.out.println(resource.getURL());
            }
            
        }
        catch (IOException e)
        {
            System.out.println("异常");
        }
        try
        {
            for (Resource resource : resources)
            {
                System.out.println(resource.getInputStream());
            }
        }
        catch (IOException e)
        {
            System.out.println("异常");
        }
        System.out.println("------");
    }
    
   
}
