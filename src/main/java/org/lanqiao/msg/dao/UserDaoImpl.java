package org.lanqiao.msg.dao;

import org.lanqiao.msg.enity.user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao<user> implements UserDao{

    @Override
    public List<user> getAllUser(int pageSize, int pageNum){
        return executeQuery("select id,author,msg,date_format(date,'%Y-%m-%d %H:%i:%s') as date from msgBorder limit ? ,?",new Object[]{pageSize*(pageNum-1),pageSize});
    }

    @Override
    public List<user> getAllUser() {
        return executeQuery("select id,author,msg,date_format(date,'%Y-%m-%d %H:%i:%s') as date from msgBorder ");
    }

    @Override
    public boolean send(user user) {
         executeUpdate("insert  into msgborder(author,msg) values(?,?);",new Object[]{user.getAuthor(),user.getMsg()});
        return true;
    }

    @Override
    public boolean checkUser(user user) {
        return false;
    }

    @Override
    public int gerUsern() {
        return 0;
    }


}
