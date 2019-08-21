package org.lanqiao.entity;

public class student {
    private Integer sid;

    private String sname;

    private Integer classes;
    private  classes clas;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", classes=" + classes +
                ", clas=" + clas +
                '}';
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

}