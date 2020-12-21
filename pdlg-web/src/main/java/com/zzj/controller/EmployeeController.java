package com.zzj.controller;

import com.zzj.service.EmployeeService;
import com.zzj.vo.Employee;
import com.zzj.vo.PageVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @CrossOrigin
    @PostMapping("/login.action")
    //@RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(Employee employee,
                        @RequestParam(value = "rememberme",defaultValue = "false")boolean rememberme ,
                        HttpServletRequest request) {

        //组装token
        UsernamePasswordToken token = new
                UsernamePasswordToken(employee.getUsername(), employee.getPassword());

        //记住我
        token.setRememberMe(rememberme);

        Subject subject = SecurityUtils.getSubject();

        try {
            //认证
            subject.login(token);


            //保存用户session
            Session session = subject.getSession();
            session.setAttribute("ygVo", employee);

            //返回结果
            return "l.jsp";

        } catch (Exception e) {
            //返回结果
            request.setAttribute("msg", "登录失败");
            return "dl.jsp";
        }
    }
    @CrossOrigin
    @GetMapping("/logout.action")
    @ResponseBody
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "login.jsp";
    }

    @RequestMapping("/queryEmployeeCount.action")
    @CrossOrigin
    @ResponseBody
    public PageVo<Employee> queryEmployeeCount(String employees, String sex,
                                               @RequestParam(value = "page",defaultValue = "1") int page,
                                               @RequestParam(value = "rows",defaultValue = "5")int rows) {
        return employeeService.queryEmployeeCount(employees,sex,page,rows);
    }

    @RequestMapping("/queryEmployeeById.action")
    @CrossOrigin
    @ResponseBody
    public Employee queryEmployeeById(int id) {
        return employeeService.queryEmployeeById(id);
    }

    @RequestMapping("/addEmployee.action")
    @CrossOrigin
    @ResponseBody
    public Map addEmployee(Employee employee) {
        Map map = new HashMap();
        if(employeeService.queryExist(employee.getUsername())>0){
            if(employeeService.addEmployee(employee)>0){
                map.put("msg","添加成功");
            }
        }
        return map;
    }

    @RequestMapping("/uptEmployee.action")
    @CrossOrigin
    @ResponseBody
    public Map uptEmployee(Employee employee) {
        Map map = new HashMap();
        if(employeeService.queryExist(employee.getUsername())>0){
            if(employeeService.uptEmployee(
                    employee)>0){
                map.put("msg","修改成功");
            }
        }
        return map;
    }

    @RequestMapping("/delEmployee.action")
    @CrossOrigin
    @ResponseBody
    public Map delEmployee(String ids) {
        Map map = new HashMap();
        if(employeeService.delEmployee(ids)>0){
            map.put("msg","删除成功");
        }
        return  map;
    }
}
