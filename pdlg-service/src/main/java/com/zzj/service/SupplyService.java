package com.zzj.service;

import com.zzj.vo.Supply;

import java.util.List;

public interface SupplyService {
    //根据仓库ID查
    public List<Supply> querySupplyBywid(int wid);
}
