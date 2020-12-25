package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.RoleDao;
import com.zzj.service.RoleService;
import com.zzj.vo.Employee;
import com.zzj.vo.MenuInfo;
import com.zzj.vo.PageVo;
import com.zzj.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Override
    public PageVo<Role> queryRoleCount(String rolename,int page,int rows) {
        PageVo<Role> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(roleDao.queryRoleAll(rolename));
        pageVo.setTotal(roleDao.queryRoleCount(rolename));
        return pageVo;
    }

    @Override
    public int queryRoleExist(String rolename,int rid) {
        return roleDao.queryRoleExist(rolename,rid);
    }

    @Override
    public List<Role> queryRole() {
        return roleDao.queryRole();
    }

    @Override
    public List<MenuInfo> queryRoleQuan(int rid) {
        List<MenuInfo> meuns = roleDao.queryRoleQuan(rid,0);
        for (MenuInfo menu: meuns) {
            List<MenuInfo> childmenus =roleDao.queryRoleQuan(rid,menu.getId());
            menu.setChildren(childmenus);
        }
        return meuns;
    }

    @Override
    public Role queryRoleById(int rid) {
        return roleDao.queryRoleById(rid);
    }

    @Override
    public int queryEmployeeExist(int rid) {
        return roleDao.queryEmployeeExist(rid);
    }

    @Override
    public int addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public int uptRole(Role role) {
        return roleDao.uptRole(role);
    }

    @Override
    public int delRole(int id) {
        return roleDao.delRole(id);
    }

    @Override
    public List<Role> queryQuan(int id) {
        return roleDao.queryQuan(id);
    }
}
