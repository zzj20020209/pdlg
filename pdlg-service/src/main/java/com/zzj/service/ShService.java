package com.zzj.service;

import com.zzj.vo.PageVo;
import com.zzj.vo.Shvo;

import java.util.List;

public interface ShService {
    public List<Shvo> shcx(Shvo shvo, int page, int rows);
    public PageVo<Shvo> shcxs(Shvo shvo, int page, int rows);
    public int shdel(int sid);
    //商户查询单个
    public Shvo shcxdg(int sid);
    //商户编辑
    public int shxg(Shvo shvo);
    //商户注册
    public int shzc(Shvo shvo);
    //商户审批
    public int shspcg(int sid);
    public int shspsb(int sid);
    //商户审批查询
    public List<Shvo> shspcx(Shvo shvo, int page, int rows);
    public PageVo<Shvo> shspcxs(Shvo shvo, int page, int rows);
}
