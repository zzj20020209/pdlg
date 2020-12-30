package com.zzj.service.impl;

import com.zzj.dao.StatisticsDao;
import com.zzj.service.StatisticsService;
import com.zzj.vo.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    StatisticsDao statisticsDao;

    @Override
    public List<Statistics> queryStatistics(String yue) {
        String []  str = yue.split(",");
        List<Statistics> list = new ArrayList<>();
        for (int i = 0;i<str.length;i++){
            list.add(statisticsDao.queryStatistics(Integer.parseInt(str[i])));
        }
        return list;
    }

    @Override
    public List<Statistics> queryGoodes() {
        return statisticsDao.queryGoodes();
    }
}
