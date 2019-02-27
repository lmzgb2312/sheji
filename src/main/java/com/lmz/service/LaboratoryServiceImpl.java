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
	public void save(LaboratoryArrangement record) {
	    labArrangementMapper.insertSelective(record);

	}

	@Override
	public void delete(Integer id) {
	    labArrangementMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void update(LaboratoryArrangement record,LaboratoryArrangementExample example) {
	    labArrangementMapper.updateByExampleSelective(record, example);
		
	}

	@Override
	public List<LaboratoryArrangement> get(LaboratoryArrangementExample example) {
		
		return labArrangementMapper.selectByExample(example);
	}

}
