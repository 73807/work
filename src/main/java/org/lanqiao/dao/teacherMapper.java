package org.lanqiao.dao;

import org.lanqiao.entity.teacher;

public interface teacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);
}