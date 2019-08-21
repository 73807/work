package org.lanqiao.msg.enity;

public class user {
    private int id;
    private String author;
    private String msg;
//    private Timestamp date;
private String date;
    public int getId() {
        return id;
    }
    public void setId(int id){this.id=id; }
    public String getAuthor() {return author; }
    public void setAuthor(String name) {
        this.author = name;
    }
    public String getMsg() {return msg; }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;;
    }
    @Override
    public String toString() {
        return id+author+msg+date;
    }
}
