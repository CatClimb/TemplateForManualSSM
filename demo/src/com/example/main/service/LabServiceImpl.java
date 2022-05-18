package com.example.main.service;

import com.example.main.bean.LabBean;
import com.example.main.dao.LabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LabServiceImpl implements LabService{
    @Autowired
    private LabMapper labMapper;
    @Override
    public List<LabBean> selectAll() {
        return labMapper.selectAll();
    }
}
