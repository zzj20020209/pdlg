package com.zzj.controller;

import com.zzj.service.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JurisdictionController {
    @Autowired
    JurisdictionService jurisdictionService;

    @RequestMapping("/addEmployeeJurisdiction.action")
    @CrossOrigin
    @ResponseBody
    public Map addEmployeeJurisdiction(int eid, String rids) {
        Map map = new HashMap();
        if(jurisdictionService.addEmployeeJurisdiction(eid,rids)>0){
            map.put("msg","授权成功");
        }
        return map;
    }

    @RequestMapping("/addRoleJurisdiction.action")
    @CrossOrigin
    @ResponseBody
    public Map addRoleJurisdiction(int rid, String mids) {
        Map map = new HashMap();
        if(jurisdictionService.addRoleJurisdiction(rid,mids)>0){
            map.put("msg","授权成功");
        }
        return map;
    }
}
