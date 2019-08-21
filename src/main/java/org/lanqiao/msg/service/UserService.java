package org.lanqiao.msg.service;

import org.lanqiao.msg.enity.user;

import java.util.List;

public interface UserService {
    public List<user> getAllUser(int pageSize, int pageNum);
    public List<user> getAllUser();
    public boolean send(user user);
//    public Map getUserByPage(int pageSize,int pageNum);
    public boolean checkUser(user user);
}
