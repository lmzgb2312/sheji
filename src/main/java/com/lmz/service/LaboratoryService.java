package com.lmz.service;

import java.util.List;

import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;



public interface LaboratoryService {
        
	Integer save(LaboratoryArrangement record);
	
	void delete(Integer id);
	
	void update(LaboratoryArrangement record);
	
	List<LaboratoryArrangement> get(LaboratoryArrangementExample  example);
	
	
}
