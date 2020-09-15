package org.crux.module.exam.controller;

import org.crux.module.exam.entity.Question;
import org.crux.module.exam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author shenqingwen
 * @date 2020/9/15
 **/
@Controller
@RequestMapping("/Student")
public class StudentController {

    @RequestMapping("")
    public ModelAndView entryModelOfStudent() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student");
        return mv;
    }

    //开始考试
    @Autowired    //推荐用构造器注入或set方法注入代替该变量注入
    QuestionService questionService;
    @RequestMapping("/exam")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Question> TaoTiQuestion = questionService.listTaoTiQuestion();
        mv.addObject("TaoTiQuestion", TaoTiQuestion);
        mv.setViewName("startExam");
        return mv;
    }

    @PostMapping("/endExam")
    @ResponseBody
    public String add(String option){
        System.out.println(option);
        String str = "返回值是"+option;
        return str;
    }

}
