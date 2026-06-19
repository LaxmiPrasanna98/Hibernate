package com.student.StudentProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int stuid;
    private String stuname;
    private String stuemail;
    private String stucourse;
    private int stuage;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }

    public String getStucourse() {
        return stucourse;
    }

    public void setStucourse(String stucourse) {
        this.stucourse = stucourse;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student [stuid=" + stuid +
                ", stuname=" + stuname +
                ", stuemail=" + stuemail +
                ", stucourse=" + stucourse +
                ", stuage=" + stuage + "]";
    }
}