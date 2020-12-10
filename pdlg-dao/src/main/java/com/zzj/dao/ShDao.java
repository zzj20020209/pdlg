package com.zzj.dao;

import com.zzj.vo.PageVo;
import com.zzj.vo.Shvo;

import java.util.List;

public interface ShDao {
    //商户查询
    public List<Shvo> shcx(Shvo shvo);
    public int shcxs(Shvo shvo);
}
