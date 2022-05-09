package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.Type;

import java.util.List;

public interface TypeService {

    List<Type> queryAll();

    void add(Type type);

    Type queryID(Type type);

    void edit(Type type);

    void delete(Type type);
}
