package com.zzj.service;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.UserDao;
import com.zzj.vo.PageVo;
import com.zzj.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int register(User user) {
        return userDao.register(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Override
    public PageVo<User> queryAllUser(User user, int page, int rows) {
        PageVo<User> pageVo = new PageVo<User>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(userDao.queryAllUser(user));
        pageVo.setTotal(userDao.queryUserByCount(user));
        return pageVo;
    }

    @Override
    public User queryUserName(String username) {
        return userDao.queryUserName(username);
    }
}
