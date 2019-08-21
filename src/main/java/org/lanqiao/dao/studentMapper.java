package org.lanqiao.dao;

import org.lanqiao.entity.student;

public interface studentMapper {
    student selectById1(int id);
    student selectById2(int id);
    int deleteByPrimaryKey(Integer sid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}