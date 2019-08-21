package org.lanqiao.dao;

import org.lanqiao.entity.classes;

public interface classesMapper {

    classes selectById1(int id);
    classes selectById2(int id);
    int deleteByPrimaryKey(Integer cid);

    int insert(classes record);

    int insertSelective(classes record);

    classes selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(classes record);

    int updateByPrimaryKey(classes record);
}