package com.zzj.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QxController {

    @RequiresPermissions({"addyg "})
    @GetMapping("/addemp.action")
    public String addemp(){
        System.out.println("员工添加成功");
        return "userlist.jsp";
    }

    // 多个权限之间  默认用and连接 表示每个权限都必须满足
    //可以设置拼接符  or  一个满足  ，条件成立  可以放行
    //@RequiresPermissions(value = {"user:edit","user:add"},logical = Logical.OR)
    @RequiresPermissions(value = {"user:edit"})
    @GetMapping("/editemp.action")
    public String editemp(){
        System.out.println("员工修改成功");
        return "userlist.jsp";
    }

    @RequiresPermissions({"user:del"})
    @GetMapping("/delemp.action")
    public String delemp(){
        System.out.println("员工删除成功");
        return "userlist.jsp";
    }

    @RequiresPermissions({"user:query"})
    @GetMapping("/queryemp.action")
    public String queryemp(){
        System.out.println("员工查询成功");
        return "userlist.jsp";
    }
}
