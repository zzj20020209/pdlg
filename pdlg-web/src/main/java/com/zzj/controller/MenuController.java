package com.zzj.controller;

import com.zzj.service.MenuService;
import com.zzj.vo.Employee;
import com.zzj.vo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("/menuLogin.action")
    @CrossOrigin
    @ResponseBody
    public Map menuLogin(String username, String password) {
        Map map = new HashMap();
        Employee employee = menuService.menuLogin(username,password);
        if(employee!=null){
            map.put("code","0");
            map.put("msg","登录成功");
            map.put("id",employee.getId());
            map.put("username",employee.getEname());
            return map;
        }
        map.put("code","1");
        map.put("msg","登录失败");
        return map;
    }

    @RequestMapping("/queryMenuAll.action")
    @CrossOrigin
    @ResponseBody
    public List<MenuInfo> queryMenuAll(int id) {
        return menuService.queryMenuAll(id);
    }

    @RequestMapping("/queryMenuAlls.action")
    @CrossOrigin
    @ResponseBody
    public List<MenuInfo> queryMenuAlls() {
        return menuService.queryMenuAlls();
    }
}
