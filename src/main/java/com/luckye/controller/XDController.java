package com.luckye.controller;

import com.luckye.pojo.Company;
import com.luckye.pojo.User;
import com.luckye.service.CompanyService;
import com.luckye.service.UserService;
import com.luckye.vs.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class XDController {

    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;

    @RequestMapping("/login")
    Result login(User user){
        User loginUser = userService.login(user);
        if(loginUser == null){
            return new Result(0,"登陆失败","用户名或密码错误");
        }else {
            return new Result(1,"登陆成功",null);
        }

        // System.out.println("获取登录请求");
        // return new Result(1,"登陆成功",null);
    }

    @RequestMapping("/getimg")
    Result getimg(){
        System.out.println("获取图片请求");
        return new Result(1,"获取数据成功","/img/process.png");
    }

    @GetMapping("/aboutus")
    Result aboutus(){
        Company company = companyService.selectById(1);
        if(company == null){
            return new Result(0,"获取数据失败",null);
        }else {
            return new Result(1,"获取数据成功",company);
        }

        // System.out.println("获取公司请求");
        // Company company = new Company();
        // company.setTitle("公司简介");
        // company.setSubTitle("河南华杉集团有限公司");
        // company.setInfo("<p>华杉科技一直秉承 “不负每一个期待” ,致力于为整个互联网科技行业输送高级技术人才、做好每一款外包项目。</p><p>华杉科技是一家既专注于培养高级IT技术人才，为学员提供定制化IT职业规划方案及意见咨询服务，又是国内领先的智能手机软件外包服务商。集团由原腾讯技术总监，原58同城技术总监共同创立。</p><p>华杉科技拥有业内知名的教研团队和雄厚的课程研发能力，课程的快速迭代时刻紧跟当今较为流行的前沿技术、不同行业的外包项目作为支撑，强有力的保证了学员的核心竞争力。强竞争力的一线技术人员和完善的外包服务流程充分保证了每一款项目的顺利执行。</p>");
        //
        // return new Result(1,"获取数据成功",company);
    }
}