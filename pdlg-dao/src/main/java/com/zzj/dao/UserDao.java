package com.zzj.dao;

import com.zzj.vo.User;

import java.util.List;

public interface UserDao {

    public User login(User user);

    public int register(User user);

    public int updateUser(User user);

    public int delUser(int id);

    public User queryUserById(int id);

    public List<User> queryAllUser(User user);

    public int queryUserByCount(User user);

    public User queryUserName(String username);
}
