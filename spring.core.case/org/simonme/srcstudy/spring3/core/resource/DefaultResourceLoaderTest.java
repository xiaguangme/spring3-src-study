/*
 * 文 件 名:  DefaultResourceLoaderTest.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年5月28日
 */
package org.simonme.srcstudy.spring3.core.resource;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.ContextResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年5月28日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class DefaultResourceLoaderTest
{
    
    @Test
    public void testGetResource001()
    {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("org/simonme/srcstudy/spring3/core/resource/testConfigData.properties");
        System.out.println(resource);
        System.out.println(resource.getClass());
        System.out.println("PathWithinContext:" + ((ContextResource)resource).getPathWithinContext());
        try
        {
            System.out.println("URL:" + ((ContextResource)resource).getURL());
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        /**
         * class path resource [org/simonme/srcstudy/spring3/core/resource/testConfigData.properties]
         * class org.springframework.core.io.DefaultResourceLoader$ClassPathContextResource
         * PathWithinContext:org/simonme/srcstudy/spring3/core/resource/testConfigData.properties
         * URL:file:/Users/simon/600.self/05.code/04.java/11.spring3-src-study/spring3-src-study/bin/org/simonme/srcstudy/spring3/core/resource/testConfigData.properties
         */
    }
    
    @Test
    public void testGetResource002()
    {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("file:/Users/simon/600.self/05.code/04.java/11.spring3-src-study/spring3-src-study/bin/org/simonme/srcstudy/spring3/core/resource/testConfigData.properties");
        System.out.println(resource);
        System.out.println(resource.getClass());
        System.out.println("PathWithinContext:" + ((ContextResource)resource).getPathWithinContext());
        try
        {
            System.out.println("URL:" + ((ContextResource)resource).getURL());
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        /**
         * class path resource [org/simonme/srcstudy/spring3/core/resource/testConfigData.properties]
         * class org.springframework.core.io.DefaultResourceLoader$ClassPathContextResource
         * PathWithinContext:org/simonme/srcstudy/spring3/core/resource/testConfigData.properties
         * URL:file:/Users/simon/600.self/05.code/04.java/11.spring3-src-study/spring3-src-study/bin/org/simonme/srcstudy/spring3/core/resource/testConfigData.properties
         */
    }
}
