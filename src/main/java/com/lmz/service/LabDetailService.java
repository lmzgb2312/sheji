package com.lmz.service;

import java.util.List;

import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;



public interface LabDetailService {

    
    Integer save(LabDetail record);
    
    void delete(Integer id);
    
    Integer update(LabDetail record);
    
    List<LabDetail> get(LabDetailExample  example);
    
    LabDetail queryOne(Integer id);
}
