package com.zzj.service.impl;

import com.zzj.dao.MenuDao;
import com.zzj.service.MenuService;
import com.zzj.vo.Employee;
import com.zzj.vo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImp implements MenuService {

    @Autowired
    MenuDao menuDao;

    @Override
    public Employee menuLogin(String username, String password) {
        return menuDao.menuLogin(username,password);
    }

    @Override
    public List<MenuInfo> queryMenuAll(int id) {
        List<MenuInfo> meuns = menuDao.queryMenuAll(id,0);
        for (MenuInfo menu: meuns) {
            List<MenuInfo> childmenus =menuDao.queryMenuAll(id,menu.getId());
            menu.setChildMenu(childmenus);
        }
        return meuns;
    }

    @Override
    public List<String> anj(int id) {
        return menuDao.anj(id);
    }

}
