package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.Type;
import com.bjpowernode.crm.settings.mapper.TypeMapper;
import com.bjpowernode.crm.settings.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> queryAll() {
      List<Type> list = typeMapper.queryAll();
        return list;
    }

    @Override
    public void add(Type type) {
        typeMapper.add(type);
    }

    @Override
    public Type queryID(Type type) {
        return typeMapper.queryID(type);
    }

    @Override
    public void edit(Type type) {
        typeMapper.edit(type);
    }

    @Override
    public void delete(Type type) {
        typeMapper.delete(type);
    }
}
