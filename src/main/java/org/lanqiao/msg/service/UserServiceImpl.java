package org.lanqiao.msg.service;

import org.lanqiao.msg.dao.UserDao;
import org.lanqiao.msg.enity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<user> getAllUser(int pageSize, int pageNum){
        return userDao.getAllUser(pageSize,pageNum);
    }

    @Override
    public List<user> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public boolean send(user user) {
        return userDao.send(user);
    }

//    @Override
//    public Map getUserByPage(int pageSize, int pageNum) {
//        return map;
//    }

    @Override
    public boolean checkUser(user user) {
        return userDao.checkUser(user);
    }
}
