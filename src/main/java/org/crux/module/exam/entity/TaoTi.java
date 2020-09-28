package org.crux.module.exam.entity;

import java.util.Date;

public class TaoTi {

    private int id;   //套题ID号
    private int lessonId;   //套题所属课程ID号
    private String nameT;   //套题名字
    private Date joinTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getNameT() {
        return nameT;
    }

    public void setNameT(String name) {
        this.nameT = name;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

}
