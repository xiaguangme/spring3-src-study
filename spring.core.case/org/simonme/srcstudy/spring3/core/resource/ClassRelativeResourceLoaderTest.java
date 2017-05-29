/*
 * 文 件 名:  ClassRelativeResourceLoaderTest.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年5月28日
 */
package org.simonme.srcstudy.spring3.core.resource;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.ClassRelativeResourceLoader;
import org.springframework.core.io.ContextResource;
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
public class ClassRelativeResourceLoaderTest
{
    
    @Test
    public void testGetResource()
    {
        ClassRelativeResourceLoader loader = new ClassRelativeResourceLoader(org.apache.commons.logging.impl.AvalonLogger.class);
        Resource resource = loader.getResource("../Log.class");
        System.out.println(resource.getClass());
        try
        {
            System.out.println(resource.getURL());
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ContextResource contextResource = (ContextResource)resource;
        System.out.println(contextResource.getPathWithinContext());
    }
}
