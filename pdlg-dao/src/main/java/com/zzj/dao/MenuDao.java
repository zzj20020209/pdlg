package com.zzj.dao;

import com.zzj.vo.Employee;
import com.zzj.vo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    public List<String> anj(@Param("id") int id);

    public Employee menuLogin(@Param(value = "username") String username, @Param(value = "password") String password);

    public List<MenuInfo> queryMenuAll(@Param(value = "id") int id, @Param(value = "parentId") int parentId);
}
