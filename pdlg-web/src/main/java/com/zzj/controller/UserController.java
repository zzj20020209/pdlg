package com.zzj.controller;

import com.zzj.service.UserService;
import com.zzj.vo.PageVo;
import com.zzj.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login.action")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> login(User user, HttpSession session){
        Map<String,Object> msg = new HashMap<String,Object>();
        User userLogin = userService.login(user);

        if (userLogin!=null){
            session.setAttribute("user",userLogin);
            msg.put("yhname",userLogin.getName());
            msg.put("username",userLogin.getUsername());
            msg.put("mm",userLogin.getPassword());
            msg.put("id",userLogin.getId());
            msg.put("mag","登录成功");
            msg.put("code","0");
        }else {
            msg.put("code","1");
            msg.put("mag","账号或密码错误");
        }
        return msg;
    }

    @RequestMapping("/register.action")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> register(User user){
        Map<String,Object> msg = new HashMap<String,Object>();
        User userName = userService.queryUserName(user.getUsername());
        if (userName!=null){
            msg.put("flag",false);
            return msg;
        }
        int rows = userService.register(user);
        if (rows==1){
            msg.put("flag",true);
            return msg;
        }
        return msg;
    }

    @RequestMapping("/updateUser.action")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> updateUser(User user){
        Map<String,Object> msg = new HashMap<String,Object>();
        int rows =  userService.updateUser(user);
       if (rows==1){
           msg.put("flag",true);
           return msg;
       }
       msg.put("flag",false);
       return msg;
    }

    @RequestMapping("/delUser.action")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> delUser(int id){
        Map<String,Object> map = new HashMap<String,Object>();
        int rows = userService.delUser(id);
        if(rows==1){
            map.put("flag",true);
        }else {
            map.put("flag",false);
        }
        return map;
    }

    @RequestMapping("/queryUserById.action")
    @ResponseBody
    @CrossOrigin
    public User queryUserById(int id){
        return userService.queryUserById(id);
    }

    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<User> queryAllUser(User user, @RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "rows", defaultValue = "5") int rows){
        return userService.queryAllUser(user,page,rows);
    }
}
