package com.zzj.controller;

import com.zzj.dao.RoleDao;
import com.zzj.service.RoleService;
import com.zzj.vo.PageVo;
import com.zzj.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("/queryRoleCount.action")
    @CrossOrigin
    @ResponseBody
    public PageVo<Role> queryRoleCount(String rolename,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return roleService.queryRoleCount(rolename, page, rows);
    }

    @RequestMapping("/queryRoleById.action")
    @CrossOrigin
    @ResponseBody
    public Role queryRoleById(int rid) {
        return roleService.queryRoleById(rid);
    }

    @RequestMapping("/addRole.action")
    @CrossOrigin
    @ResponseBody
    public Map addRole(Role role) {
        Map map = new HashMap();
        if (roleService.queryRoleExist(role.getRolename(),role.getRid()) == 0) {
            if (roleService.addRole(role) > 0) {
                map.put("msg", "添加成功");
            }
        } else {
            map.put("msg", "该角色名已存在");
        }
        return map;
    }

    @RequestMapping("/uptRole.action")
    @CrossOrigin
    @ResponseBody
    public Map uptRole(Role role) {
        Map map = new HashMap();
        if (roleService.queryRoleExist(role.getRolename(),role.getRid()) < 2) {
            if (roleService.uptRole(role) > 0) {
                map.put("msg", "修改成功");
            }
        } else {
            map.put("msg", "该角色名已存在");
        }
        return map;
    }

    @RequestMapping("/delRole.action")
    @CrossOrigin
    @ResponseBody
    public Map delRole(int rid) {
        Map map = new HashMap();
        if (roleService.queryEmployeeExist(rid) == 0) {
            if (roleService.delRole(rid) > 0) {
                map.put("msg", "删除成功");
            }
        } else {
            map.put("msg", "该角色有人在使用，请先将该员工移至其他角色");
        }
        return map;
    }
}
