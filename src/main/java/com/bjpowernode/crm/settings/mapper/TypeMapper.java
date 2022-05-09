package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.settings.domain.Type;

import java.util.List;

public interface TypeMapper {
   //查询所有
    List<Type> queryAll();

    void add(Type type);

    Type queryID(Type type);

    void edit(Type type);

    void delete(Type type);
    //删除
    /*void delete();

    //新增
    void add();

    //修改
    void update();*/
}
