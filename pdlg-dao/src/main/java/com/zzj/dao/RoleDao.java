package com.zzj.dao;

import com.zzj.vo.MenuInfo;
import com.zzj.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;

public interface RoleDao {
    public List<Role> queryRoleAll(@Param(value = "rolename") String rolename);

    public int queryRoleCount(@Param(value = "rolename") String rolename);

    public List<Role> queryRole();

    public List<MenuInfo> queryRoleQuan(@Param(value = "rid") int rid, @Param(value = "parentId") int parentId);

    public int queryRoleExist(@Param(value = "rolename") String rolename, @Param(value = "rid") int rid);

    public Role queryRoleById(int rid);

    public int queryEmployeeExist(int rid);

    public int addRole(Role role);

    public int uptRole(Role role);

    public int delRole(int rid);

    public List<Role> queryQuan(int id);
}
