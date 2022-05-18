package com.example.main.dao;



import com.example.main.bean.LabBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 3.查看表
 */

public interface LabMapper {
    public List<LabBean> selectAll();
}
