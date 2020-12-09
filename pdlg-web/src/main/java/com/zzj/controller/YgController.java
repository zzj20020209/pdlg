package com.zzj.controller;

import com.zzj.vo.YgVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
public class YgController {
    @PostMapping("/login.action")
    //@RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(YgVo ygVo,
                        @RequestParam(value = "rememberme",defaultValue = "false")boolean rememberme ,
                        HttpServletRequest request) {

        //组装token
        UsernamePasswordToken token = new
                UsernamePasswordToken(ygVo.getUsername(), ygVo.getPassword());

        //记住我
        token.setRememberMe(rememberme);

        Subject subject = SecurityUtils.getSubject();

        try {
            //认证
            subject.login(token);


            //保存用户session
            Session session = subject.getSession();
            session.setAttribute("ygVo",ygVo);

            //返回结果
            return "lb.jsp";

        } catch (Exception e) {
            //返回结果
            request.setAttribute("msg", "登录失败");
            return "dl.jsp";
        }
    }

    @GetMapping("/logout.action")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "login.jsp";
    }
}
