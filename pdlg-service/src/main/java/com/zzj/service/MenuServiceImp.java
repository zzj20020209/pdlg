package com.zzj.service;

import com.zzj.dao.MenuDao;
import com.zzj.service.MenuService;
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
    public List<String> anj(int id) {
        return menuDao.anj(id);
    }

}
