package com.zzj.dao;

import com.zzj.vo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    public List<String> anj(@Param("id") int id);

}
