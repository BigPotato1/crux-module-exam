package org.crux.module.exam.dao;

import org.crux.module.exam.entity.StuResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/10
 */
//对学生的考试成绩进行增删改查
@Repository
public interface StuResultDao {

    int getTotal();

    void addStuResult(StuResult stuResult);

    void deleteStuResult(int id);

    void updateStuResult(StuResult stuResult);

    StuResult selectStuResult(int id);

    List<StuResult> list(int start, int count);

    List<StuResult> listStuResult();

}
