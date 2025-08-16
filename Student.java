package com.sa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name=" student_data") use as table name
public class Student {

    @Id
    //@Column(name="st_id") use as column name
    private int sid;
    //@Column(name="s_name") use as column name
    private String name;
    private String sub;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid=" + sid +
                ", sub='" + sub + '\'' +
                '}';
    }
}
