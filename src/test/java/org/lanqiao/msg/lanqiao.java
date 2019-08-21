package org.lanqiao.msg;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.dao.UserMapper;
import org.lanqiao.entity.User;

import java.io.Reader;

/**
 * Created by David on 2019/8/9.
 */
public class lanqiao {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-Config.xml");
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
      /*  try {
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            int count=userMapper.getUser_count();
//            System.out.println(count);
//            User user = userMapper.selectByPrimaryKey(1);
//            System.out.println(user);
//写有问题
//            UserDao userDao=session.getMapper(UserDao.class);
//            int count=userDao.getUser_count();
//            System.out.println(count);
            User lili=new User();
            lili.setId(100);
            lili.setAuthor("lili");
            lili.setMsg("hiya");
            UserMapper userMapper=session.getMapper(UserMapper.class);
            userMapper.insert(lili);
//            List<User> users=userMapper.getPage(4,1);
//            for(User user:users){
//                System.out.println(user);
//            }
       */
      try{
//          StudentMapper studentMapper=session.getMapper(StudentMapper.class);
//          Student student=studentMapper.selectByPrimaryKey(1);
//          System.out.println(student);
//          ClassesMapper classesMapper=session.getMapper(ClassesMapper.class);
//          Classes classes=classesMapper.selectByPrimaryKey(1);
//          System.out.println(classes);
          UserMapper userMapper = session.getMapper(UserMapper.class);
//            int count=userMapper.getUser_count();
//            System.out.println(count);
            User user = userMapper.selectByPrimaryKey(1);
            System.out.println(user);
        } finally {
            session.close();
        }
    }
}
