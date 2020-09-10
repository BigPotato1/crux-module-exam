package org.crux.module.exam.entity;

public class StuResult {

    private int id;   //套题考试结果ID号
    private int studentId;   //考试结果所属学生ID号
    private int taoTiID;   //考试结果所属套题ID号
    private int resSingle;   //考试结果单选得分
    private int resMore;   //考试结果多选得分
    private int resTotal;   //考试结果总得分

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTaoTiID() {
        return taoTiID;
    }

    public void setTaoTiID(int taoTiID) {
        this.taoTiID = taoTiID;
    }

    public int getResSingle() {
        return resSingle;
    }

    public void setResSingle(int resSingle) {
        this.resSingle = resSingle;
    }

    public int getResMore() {
        return resMore;
    }

    public void setResMore(int resMore) {
        this.resMore = resMore;
    }

    public int getResTotal() {
        return resTotal;
    }

    public void setResTotal(int resTotal) {
        this.resTotal = resTotal;
    }

}
