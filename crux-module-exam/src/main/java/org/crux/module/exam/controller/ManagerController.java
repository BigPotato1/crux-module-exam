package org.crux.module.exam.controller;

import org.crux.module.exam.entity.Manager;
import org.crux.module.exam.entity.StuResult;
import org.crux.module.exam.service.ManagerService;
import org.crux.module.exam.service.StuResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//基于项目 mvcDemo-master 编写
    @Controller
    @RequestMapping("/Manager")
    public class ManagerController {

    @Autowired    //推荐用构造器注入或set方法注入代替该变量注入
    ManagerService managerService;

    @Autowired    //推荐用构造器注入或set方法注入代替该变量注入
    StuResultService stuResultService;

    @RequestMapping("/Login")
    public ModelAndView selectUser() throws Exception {
        //查询所有学生的各科成绩
        List<StuResult> allStuResult=stuResultService.listStuResult();
        for (StuResult stuResult:allStuResult) {
            System.out.print(stuResult.getId()+"\t");
            System.out.print(stuResult.getStudent().getName()+"\t");
            System.out.print(stuResult.getTaoTi().getNameT()+"\t");
            System.out.print(stuResult.getResSingle()+"\t");
            System.out.print(stuResult.getResMore()+"\t");
            System.out.println(stuResult.getResTotal()+"\t");
        }

        //查询打印所有管理员的信息
        List<Manager> allManager=managerService.listManager();
//        for (Manager singManager:allManager) {
//            System.out.print(singManager.getId()+"\t");
//            System.out.print(singManager.getPwd()+"\t");
//            System.out.println(singManager.getName());
//        }
        String message = "ID 密码 管理员登录名";
        ModelAndView mv = new ModelAndView();
        Manager manager = managerService.selectManager(1);
        mv.addObject("manager3", manager);   //此处左侧 “manager3” 是对应view层文件里面用来接收右侧 manager 变量的变量名
        mv.addObject("allManager3", allManager);
        mv.addObject("message", message);
        mv.setViewName("manager");  //此处的 “manager” 是对应view层文件名
        return mv;
    }
    //查询所有学生的各科成绩
}
