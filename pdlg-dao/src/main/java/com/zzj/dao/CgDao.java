package com.zzj.dao;

import com.zzj.vo.CgVo;
import com.zzj.vo.Warehouse;

public interface CgDao {
    //采购操作
    public int cg(CgVo cgVo);
    //改库存
    public int gkc(CgVo cgVo);

}
