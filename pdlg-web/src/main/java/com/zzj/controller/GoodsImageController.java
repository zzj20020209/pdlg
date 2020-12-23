package com.zzj.controller;

import com.zzj.service.GoodsImageService;
import com.zzj.vo.Goods;
import com.zzj.vo.GoodsImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GoodsImageController {
    @Autowired
    GoodsImageService goodsImageService;
   /* @RequestMapping(value ="/shezhiuserroleInfo.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String shezhiuserroleInfo(EmployeeInfo employeeInfo, String mids){
        String msg="";
        List<UserroleInfo> userroleInfoList=new ArrayList<>();
        if(mids!=""){
            String[] midss = mids.split(",");
            int[] idsss = new int[midss.length];
            for(String s:midss){
                UserroleInfo userroleInfo=new UserroleInfo();
                userroleInfo.setEid(employeeInfo);
                RoleInfo roleInfo=new RoleInfo();
                roleInfo.setRoleId(Integer.parseInt(s));
                userroleInfo.setRid(roleInfo);
                userroleInfoList.add(userroleInfo);
                System.out.println("ss"+userroleInfo);
                System.out.println(userroleInfo);
                List<UserroleInfo> userroleInfo1=userroleInfoService.queryByeid(employeeInfo.getId());
                if(userroleInfo1.size()>0){
                    userroleInfoService.deleteUserroleInfoByeid(employeeInfo.getId());
                }
                int numm=userroleInfoService.addUserroleInfoByeidrid(userroleInfoList);
                if(numm==idsss.length){
                    msg="设置成功";
                }else{
                    msg="设置失败";
                }

            }
        }else{
            userroleInfoService.deleteUserroleInfoByeid(employeeInfo.getId());
        }

        return  msg;
    }*/
    //添加

}
