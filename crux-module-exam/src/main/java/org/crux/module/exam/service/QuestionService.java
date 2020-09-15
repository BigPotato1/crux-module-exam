package org.crux.module.exam.service;

import org.crux.module.exam.dao.QuestionDao;
import org.crux.module.exam.entity.Question;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shenqingwen
 * @date 2020/9/15
 **/
@Service
public class QuestionService {

    //管理员查询题库服务

    //考生进行考试时随机生成套题服务
    @Resource
    QuestionDao questionDao;
    public List<Question> listTaoTiQuestion() {
        return questionDao.listTaoTiQuestion();
    }
}
