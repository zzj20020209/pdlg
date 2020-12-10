package com.zzj.controller;

import com.zzj.service.UserService;
import com.zzj.vo.PageVo;
import com.zzj.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login.action")
    @ResponseBody
    public Map<String,Object> login(String username, String password, HttpSession session){
        Map<String,Object> msg = new HashMap<String,Object>();
        User user = userService.login(username,password);
        if (user!=null){
            session.setAttribute("user",user);
            msg.put("flag",true);
            return msg;
        }
        msg.put("flag",false);
        return msg;
    }

    @RequestMapping("/register.action")
    @ResponseBody
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

    @RequestMapping("/queryUserById.action")
    @ResponseBody
    public User queryUserById(int id){
        return userService.queryUserById(id);
    }

    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    public PageVo<User> queryAllUser(User user, @RequestParam(value = "page", defaultValue = "1") int page,
                                     @RequestParam(value = "rows", defaultValue = "10") int rows){
        return userService.queryAllUser(user,page,rows);
    }
}
