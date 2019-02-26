package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.CourseArrangementMapper;
import com.lmz.vo.CourseArrangement;
import com.lmz.vo.CourseArrangementExample;


@Service("courseService")
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseArrangementMapper courseArrangementMapper;

	@Override
	public void save(CourseArrangement record) {
		courseArrangementMapper.insertSelective(record);

	}

	@Override
	public void delete(Integer id) {
		courseArrangementMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void update(CourseArrangement record,CourseArrangementExample example) {
		courseArrangementMapper.updateByExampleSelective(record, example);
		
	}

	@Override
	public List<CourseArrangement> get(CourseArrangementExample example) {
		
		return courseArrangementMapper.selectByExample(example);
	}

}
