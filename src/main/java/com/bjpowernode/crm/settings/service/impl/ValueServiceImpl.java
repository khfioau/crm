package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.Value;
import com.bjpowernode.crm.settings.mapper.ValueMapper;
import com.bjpowernode.crm.settings.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueServiceImpl implements ValueService {
    @Autowired
    private ValueMapper valueMapper;
    @Override
    public List<Value> selectAll() {
        List<Value> values = valueMapper.selectAll();
        return values;
    }
}
