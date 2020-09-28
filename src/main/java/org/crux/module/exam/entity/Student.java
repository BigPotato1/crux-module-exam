package org.crux.module.exam.entity;

public class Student {

    private int id;			//考生ID号
    private String pwd;		//登录密码
    private String name;	//考生名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
