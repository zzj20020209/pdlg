package com.zzj.service;

import org.apache.ibatis.annotations.Param;

public interface JurisdictionService {

    //角色授权
    public int addEmployeeJurisdiction(int eid, String rids);

    //菜单授权
    public int addRoleJurisdiction(int rid, String mids);
}
