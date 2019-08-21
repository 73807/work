package org.lanqiao.msg.dao;


import org.lanqiao.msg.enity.user;

import java.util.List;

public interface UserDao {
    public List<user> getAllUser(int pageSize, int pageNum);
    public List<user> getAllUser();
    public boolean send(user user);
    public boolean checkUser(user user);
    public  int gerUsern();

}
