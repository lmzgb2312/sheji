package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.LaboratoryArrangementMapper;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;




@Service("courseService")
public class LaboratoryServiceImpl implements LaboratoryService {
	
	@Autowired
	private LaboratoryArrangementMapper labArrangementMapper;

	@Override
	public Integer save(LaboratoryArrangement record) {
	    LaboratoryArrangementExample example = new LaboratoryArrangementExample();
	    example.createCriteria().andLabNameEqualTo(record.getLabName());
	    Long l = labArrangementMapper.countByExample(example);
	   System.out.println(record.getLabStartTime().toString());
	    int i = l.intValue();
	    if(i == 0){
	        labArrangementMapper.insertSelective(record);
	    }
	    return i;

	}

	@Override
	public void delete(Integer id) {
	    labArrangementMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void update(LaboratoryArrangement record) {
	    LaboratoryArrangementExample example = new LaboratoryArrangementExample();
      example.createCriteria().andLabNameEqualTo(record.getLabName());
	    labArrangementMapper.updateByExampleSelective(record, example);
		
	}

	@Override
	public List<LaboratoryArrangement> get(LaboratoryArrangementExample example) {
		
		return labArrangementMapper.selectByExample(example);
	}

}
