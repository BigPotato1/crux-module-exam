package org.crux.module.exam.controller;

import org.crux.module.exam.entity.Question;
import org.crux.module.exam.entity.Student;
import org.crux.module.exam.service.QuestionService;
import org.crux.module.exam.service.StudentService;
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

    @Autowired
    StudentService studentService;

    @RequestMapping("/Login")
    public ModelAndView login(String name, String pwd) throws Exception {
        //先判断用户输入的登录名是否合法，即是否属于数据库里已有用户名
        List<Student> allStudent = studentService.listStudent();
        for (Student student : allStudent) {
            if (!student.getName().equals(name)) {
                continue;
            } else {
                //再判断登录密码是否正确
                if (student.getPwd().equals(pwd)) {
                    ModelAndView mv = new ModelAndView();
                    mv.addObject("student3", student);
                    mv.setViewName("studentHomePage");
                    return mv;
                }
                ModelAndView mv = new ModelAndView();
                mv.setViewName("studentLoginError");
                return mv;
            }
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("studentLoginError");
        return mv;
    }

    String[] ANSWER = new String[2];
    //开始考试
    @Autowired    //推荐用构造器注入或set方法注入代替该变量注入
            QuestionService questionService;

    @RequestMapping("/Exam")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Question> taoTiQuestion = questionService.listTaoTiQuestion();
        ANSWER[0] = taoTiQuestion.get(0).getAnswer();
        ANSWER[1] = taoTiQuestion.get(1).getAnswer();
        mv.addObject("taoTiQuestion", taoTiQuestion);
        mv.setViewName("startExam");
        return mv;
    }

    @PostMapping("/EndExam")
    @ResponseBody
    public ModelAndView getScore(String question1, String question2) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Question> taoTiQuestion = questionService.listTaoTiQuestion();
        int score = 0;
        if (ANSWER[0].equals(question1)) {
            score = score + 50;
        }
        if (ANSWER[1].equals(question2)) {
            score = score + 50;
        }
        mv.addObject("score", score);
        mv.setViewName("endExam");
        return mv;
    }

}
