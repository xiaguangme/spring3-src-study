/*
 * 文 件 名:  UserServiceImpl.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年8月27日
 */
package org.simonme.srcstudy.spring3.demo.service.impl;

import java.util.List;

import org.simonme.srcstudy.spring3.demo.bean.User;
import org.simonme.srcstudy.spring3.demo.bean.UserQueryForm;
import org.simonme.srcstudy.spring3.demo.dao.UserDao;
import org.simonme.srcstudy.spring3.demo.service.UserService;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年8月27日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserServiceImpl implements UserService
{
    
    
    private UserDao userDao;
    
    /**
     * @param queryForm
     * @return
     */
    @Override
    public List<User> queryUser(UserQueryForm queryForm)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * @param user
     * @return
     */
    @Override
    public int saveUser(User user)
    {
        return 0;
    }

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
    
    
    
}
