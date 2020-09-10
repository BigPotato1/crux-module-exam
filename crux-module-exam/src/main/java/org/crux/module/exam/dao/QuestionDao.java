package org.crux.module.exam.dao;

import org.crux.module.exam.entity.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/10
 */
@Repository
public interface QuestionDao {

    int getTotal();
    void addQuestion(Question question);
    void deleteQuestion(int id);
    void updateQuestion(Question question);
    Question selectQuestion(int id);
    List<Question> list(int start, int count);

}
