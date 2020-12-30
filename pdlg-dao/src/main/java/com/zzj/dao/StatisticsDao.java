package com.zzj.dao;

import com.zzj.vo.Statistics;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StatisticsDao {

    public Statistics queryStatistics(@Param(value = "yue") int yue);

    public List<Statistics> queryGoodes();
}
