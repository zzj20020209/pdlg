package com.zzj.controller;

import com.zzj.service.StatisticsService;
import com.zzj.vo.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatisticsController {
    @Autowired
    StatisticsService statisticsService;

    @RequestMapping("/queryStatistics.action")
    @CrossOrigin
    @ResponseBody
    public List<Statistics> queryStatistics(String yue) {
        return statisticsService.queryStatistics(yue);
    }

    @RequestMapping("/queryGoodes.action")
    @CrossOrigin
    @ResponseBody
    public List<Statistics> queryGoodes() {
        return statisticsService.queryGoodes();
    }
}
