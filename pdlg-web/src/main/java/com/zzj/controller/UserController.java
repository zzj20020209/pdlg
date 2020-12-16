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
        System.out.println(userLogin);
        if (userLogin!=null){
            session.setAttribute("user",userLogin);
            msg.put("flag",true);
        }else {
            msg.put("flag",false);
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
    public Map<String,Object> updateUser(User user, @RequestParam("image") MultipartFile image){
        Map<String,Object> msg = new HashMap<String,Object>();
        user.setImage("./src/assets/image"+image.getOriginalFilename());
        try {
            image.transferTo(new File("..\\pdlg\\src\\assets\\"+image.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    @CrossOrigin
    public User queryUserById(int id){
        return userService.queryUserById(id);
    }

    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<User> queryAllUser(User user, @RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "rows", defaultValue = "10") int rows){
        return userService.queryAllUser(user,page,rows);
    }
}
