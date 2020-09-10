package org.crux.module.exam.entity;

public class Question {

    private int ID;   //题目ID号
    private int taoTiId;   //题目所属套题ID号
    private int lessonId;   //题目所属课程ID号
    private String type;   //题目类型：单选，多选
    private String subject;   //题目的主体问题内容
    private String optionD;   //D选项内容
    private String optionC;   //C...
    private String optionB;   //B...
    private String optionA;   //A...
    private String answer;    //问题答案

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTaoTiId() {
        return taoTiId;
    }

    public void setTaoTiId(int taoTiId) {
        this.taoTiId = taoTiId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
