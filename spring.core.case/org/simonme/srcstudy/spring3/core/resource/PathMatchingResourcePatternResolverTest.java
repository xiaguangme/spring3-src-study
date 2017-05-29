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
import org.springframework.core.io.FileSystemResource;
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
    public void testContextResource001()
    {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try
        {
            Resource[] resources = resolver.getResources("classpath*:org/apache/commons/logging/*.class");
            System.out.println((resources[0].getClass()));
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
