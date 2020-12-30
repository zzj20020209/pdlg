package com.zzj.service;

import com.zzj.vo.Statistics;

import java.util.List;

public interface StatisticsService {
    public List<Statistics> queryStatistics(String yue);

    public List<Statistics> queryGoodes();
}
