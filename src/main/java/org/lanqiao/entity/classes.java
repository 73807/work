package org.lanqiao.entity;

import java.util.Set;

public class classes {
    private Integer cid;
    private String cname;
    private  Integer student;
    private Integer teacher;

    @Override
    public String toString() {
        return "classes{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    private Set<student> students;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }
}