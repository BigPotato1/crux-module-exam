package org.crux.module.exam.controller;

import org.crux.module.exam.entity.Manager;
import org.crux.module.exam.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    @RequestMapping("/Manager")
    public class ManagerController {

    @Autowired    //推荐用构造器注入或set方法注入代替该变量注入
    ManagerService managerService;

    @RequestMapping("/Login")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        Manager manager = managerService.selectManager(1);
        mv.addObject("manager", manager);
        mv.setViewName("manager");
        return mv;
    }
}
