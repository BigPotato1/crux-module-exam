package org.crux.module.exam.entity;

public class Manager {

    private int id;            //管理员ID号
    private String pwd;        //登录密码
    private String name;    //管理员名称

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
