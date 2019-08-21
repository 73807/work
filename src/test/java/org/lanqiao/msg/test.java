package org.lanqiao.msg;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.dao.UserMapper;
import org.lanqiao.dao.classesMapper;
import org.lanqiao.dao.studentMapper;
import org.lanqiao.dao.teacherMapper;
import org.lanqiao.entity.classes;
import org.lanqiao.entity.student;

import java.io.Reader;
/**
 * Created by David on 2019/8/9.
 */
public class test {
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
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            teacherMapper teachermapper=session.getMapper(teacherMapper.class);
            studentMapper studentmapper =session.getMapper(studentMapper.class);
            classesMapper classesmapper=session.getMapper(classesMapper.class);
//            User user = userMapper.selectByPrimaryKey(1);

//            teacher t=teachermapper.selectByPrimaryKey(1);
//            System.out.println(t);
            classes clas=classesmapper.selectById1(2);
            System.out.println(clas);
            student s=studentmapper.selectById1(1);
            System.out.println(s);
//            studentMapper studentMapper=session.getMapper(studentMapper.class);
//            student student=studentMapper.selectByPrimaryKey(1);
//            System.out.println(student);
//
//            teacherMapper t=session.getMapper(teacherMapper.class);
//            teacher t1=t.selectByPrimaryKey(1);
//            System.out.println(t1);

        } finally {
            session.close();
        }
    }
}
