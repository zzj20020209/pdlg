package com.zzj.dao;

import com.zzj.vo.User;

import java.util.List;

public interface UserDao {

    public User login(String username, String password);

    public int register(User user);

    public int updateUser(User user);

    public User queryUserById(int id);

    public List<User> queryAllUser(User user);

    public int queryUserByCount(User user);

    public User queryUserName(String username);
}
