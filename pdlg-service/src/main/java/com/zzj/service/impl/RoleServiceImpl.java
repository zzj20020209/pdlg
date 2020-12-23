package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.RoleDao;
import com.zzj.service.RoleService;
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
        pageVo.setTotal(roleDao.queryRoleCount(rolename));
        pageVo.setRows(roleDao.queryRoleAll(rolename));
        return pageVo;
    }

    @Override
    public int queryRoleExist(String rolename,int rid) {
        return roleDao.queryRoleExist(rolename,rid);
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
}
