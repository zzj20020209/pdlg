package com.zzj.service;

import com.zzj.vo.Employee;
import com.zzj.vo.MenuInfo;

import java.util.List;

public interface MenuService {
    public List<String> anj(int id);

    public Employee menuLogin(String username, String password);

    public List<MenuInfo> queryMenuAll(int id);
}
