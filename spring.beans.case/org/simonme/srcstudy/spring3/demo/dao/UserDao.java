/*
 * 文 件 名:  UserDao.java
 * 版    权:   . .
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年8月27日
 */
package org.simonme.srcstudy.spring3.demo.dao;

import java.util.List;

import org.simonme.srcstudy.spring3.demo.bean.User;
import org.simonme.srcstudy.spring3.demo.bean.UserQueryForm;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  http://www.cnblogs.com/simoncook
 * @version  [版本号, 2017年8月27日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface UserDao
{
    
    /**
     * <一句话功能简述> 根据条件查询 user list  <br/>
     * <功能详细描述>
     * @param queryForm
     * @return
     * @see [类、类#方法、类#成员]
     */
    public List<User> queryUser(UserQueryForm queryForm);
    
    /**
     * <一句话功能简述> 保存user对象  <br/>
     * <功能详细描述>
     * @param user
     * @return
     * @see [类、类#方法、类#成员]
     */
    public int saveUser(User user);
}
