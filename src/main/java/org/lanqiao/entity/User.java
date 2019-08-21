package org.lanqiao.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String author;

    private String msg;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}