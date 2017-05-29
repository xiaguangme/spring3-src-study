/*
 * 文 件 名:  FileSystemResourceLoaderTest.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年5月28日
 */
package org.simonme.srcstudy.spring3.core.resource;

import org.junit.Test;
import org.springframework.core.io.FileSystemResourceLoader;
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
public class FileSystemResourceLoaderTest
{
    

    @Test
    public void testGetResourceByPath001()
    {
        FileSystemResourceLoader loader = new FileSystemResourceLoader();
        Resource resource = loader.getResource("org/simonme/srcstudy/spring3/core/resource/testConfigData.properties");
        System.out.println(resource);
    }
}
