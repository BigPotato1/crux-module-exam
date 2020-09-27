package org.crux.module.exam.entity;

import java.util.Date;

public class Lesson {

    private int id;   //课程ID号
    private String name;   //课程名称
    private Date joinTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

}
