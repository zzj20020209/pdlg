package com.zzj.realm;

import com.zzj.service.YgService;
import com.zzj.service.MenuService;
import com.zzj.vo.YgVo;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MyRealm extends AuthorizingRealm {

    @Autowired
    YgService ygService;
    @Autowired
    MenuService menuService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //从参数中获取用户名
        AuthenticationToken token= (AuthenticationToken) principals.getPrimaryPrincipal();   //认证时，第一个参数传递的数据
        String kname = (String)token.getPrincipal();

        //根据用户名查询拥有的角色名(角色id)   userdao.xxxx()
        YgVo ygVo=ygService.dl(kname);
        /*List<String> roles = roleService.cmz(kh.getKid());
        System.out.println("roles:"+roles);*/
        //根据用户名查询菜单code(菜单id)      userdao.xxxx()
        List<String> perms = menuService.anj(ygVo.getId());
        System.out.println("perms:"+perms);
        //返回权限信息(SimpleAuthorizationInfo)由父类AuthenticatingRealm 进行授权
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        /*authorizationInfo.addRoles(roles);*/
        authorizationInfo.addStringPermissions(perms);

        return authorizationInfo;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {


        //通过token获取用户名
        String username = (String) token.getPrincipal();

        //密码
        //String pwd = (String) token.getCredentials();

        //通过用户名去用户表查询当前用户数据(数据库里面当前用户名对应的密码)
        YgVo ygVo = ygService.dl(username);

        //判断   用户数据为空    当前帐号不存在
                      //不为空   帐号存在
        if(ygVo==null){
            throw new UnknownAccountException("当前帐号不存在！！！");
        }

        //返回认证信息(SimpleAuthenticationInfo)由父类AuthenticatingRealm 进行认证
        /*//构造函数三个参数
        //第一个：  token
        //第二个：   帐号对应的数据库密码
        //第三个：  当前realm名字
        SimpleAuthenticationInfo authenticationInfo =
                new SimpleAuthenticationInfo(token,userInfo.getPwd(),this.getName());*/

        //构造函数四个参数
        //第一个：  token
        //第二个：   帐号对应的数据库密码
        //第三个：  盐
        //第三个：  当前realm名字
        SimpleAuthenticationInfo authenticationInfo =
                new SimpleAuthenticationInfo(token,ygVo.getUsername(), ByteSource.Util.bytes("张三"),this.getName());

        return authenticationInfo;
    }
}
