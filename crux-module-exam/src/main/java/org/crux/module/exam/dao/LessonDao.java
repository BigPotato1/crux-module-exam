package org.crux.module.exam.dao;

import org.crux.module.exam.entity.Lesson;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/10
 */
@Repository
public interface  LessonDao {

    int getTotal();
    void addLesson(Lesson lesson);
    void deleteLesson(int id);
    void updateLesson(Lesson lesson);
    Lesson selectLesson(int id);
    List<Lesson> list(int start, int count);

}
