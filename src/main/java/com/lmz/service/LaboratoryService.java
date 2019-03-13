package com.lmz.service;

import java.util.List;

import com.lmz.vo.LabDetail;
import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LabExtendInfoExample;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;



public interface LaboratoryService {
        
	Integer save(LaboratoryArrangement record);
	
	void delete(Integer id);
	
	Integer update(LaboratoryArrangement record);
	
	List<LaboratoryArrangement> get(LaboratoryArrangementExample  example);
	
  LaboratoryArrangement queryOne(Integer id);
  
  
  List<LabExtendInfo> queryInfo(Integer id);

  
  List<LabExtendInfo> get1(LabExtendInfoExample  example);
	
}
