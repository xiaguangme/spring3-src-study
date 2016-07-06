/*
 * 文 件 名:  ServiceAImpl.java
 * 版    权:   .
 * 描    述:  <描述>
 * 修 改 人:  chen.simon
 * 修改时间:  2016-4-11
 */
package org.simonme.srcstudy.spring3.demo.service.impl;

import org.simonme.srcstudy.spring3.demo.service.ServiceA;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  Chenxiaguang
 * @version  [版本号, 2016-4-11]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class ServiceAImpl implements ServiceA
{
    
    private String field;
    
    /**
     * 模拟返回测试数据
     * @return
     */
    @Override
    public String queryA()
    {
        return "Query A Result" + field;
    }

    public String getField()
    {
        return field;
    }

    public void setField(String field)
    {
        this.field = field;
    }
    
    
    
}
