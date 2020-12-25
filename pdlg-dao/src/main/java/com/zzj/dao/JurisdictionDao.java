package com.zzj.dao;

import org.apache.ibatis.annotations.Param;

public interface JurisdictionDao {

    //角色授权
    public int addEmployeeJurisdiction(@Param(value = "eid") int eid, @Param(value = "rid") int rid);

    public int delEmployeeJurisdiction(int eid);

    //菜单授权
    public int addRoleJurisdiction(@Param(value = "rid") int rid, @Param(value = "mid") int mid);

    public int delRoleJurisdiction(int rid);
}
