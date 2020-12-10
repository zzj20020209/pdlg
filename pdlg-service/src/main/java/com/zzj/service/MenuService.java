package com.zzj.service;

import com.zzj.vo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {
    public List<String> anj(int id);
}
