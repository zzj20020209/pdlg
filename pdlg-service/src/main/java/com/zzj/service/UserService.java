package com.zzj.service;

import com.zzj.vo.PageVo;
import com.zzj.vo.User;


public interface UserService {
    public User login(String username, String password);

    public int register(User user);

    public int updateUser(User user);

    public User queryUserById(int id);

    public PageVo<User> queryAllUser(User user, int page, int rows);

    public User queryUserName(String username);
}
