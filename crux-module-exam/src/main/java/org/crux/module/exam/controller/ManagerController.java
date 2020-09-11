package org.crux.module.exam.controller;

import org.crux.module.exam.entity.Manager;
import org.crux.module.exam.service.ManagerService;
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

    @RequestMapping("/Login")
    public ModelAndView selectUser() throws Exception {
        //查询打印所有管理员的信息
        List<Manager> allManager=managerService.listManager();
        for (Manager singManager:allManager) {
            System.out.print(singManager.getId()+"\t");
            System.out.print(singManager.getPwd()+"\t");
            System.out.println(singManager.getName());
        }
        String message = "ID 密码 管理员登录名";
        ModelAndView mv = new ModelAndView();
        Manager manager = managerService.selectManager(1);
        mv.addObject("manager3", manager);   //此处左侧 “manager3” 是对应view层文件里面用来接收右侧 manager 变量的变量名
        mv.addObject("allManager3", allManager);
        mv.addObject("message", message);
        mv.setViewName("manager");  //此处的 “manager” 是对应view层文件名
        return mv;
    }
}
