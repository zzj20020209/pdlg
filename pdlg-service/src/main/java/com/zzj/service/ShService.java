package com.zzj.service;

import com.zzj.vo.PageVo;
import com.zzj.vo.Shvo;

import java.util.List;

public interface ShService {
    public List<Shvo> shcx(Shvo shvo, int page, int rows);
    public PageVo<Shvo> shcxs(Shvo shvo, int page, int rows);
}
