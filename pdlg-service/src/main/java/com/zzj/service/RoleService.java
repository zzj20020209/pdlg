package com.zzj.service;

import com.zzj.dao.RoleDao;
import com.zzj.vo.MenuInfo;
import com.zzj.vo.PageVo;
import com.zzj.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {

    public PageVo<Role> queryRoleCount(String rolename, int page, int rows);

    public int queryRoleExist(String rolename, int rid);

    public List<Role> queryRole();

    public List<MenuInfo> queryRoleQuan(int rid);

    public Role queryRoleById(int rid);

    public int queryEmployeeExist(int rid);

    public int addRole(Role role);

    public int uptRole(Role role);

    public int delRole(int id);

    public List<Role> queryQuan(int id);

}
