package com.lmz.service;

import java.util.List;

import com.lmz.vo.CourseArrangement;
import com.lmz.vo.CourseArrangementExample;

public interface CourseService {
        
	void save(CourseArrangement record);
	
	void delete(Integer id);
	
	void update(CourseArrangement record,CourseArrangementExample  example);
	
	List<CourseArrangement> get(CourseArrangementExample  example);
	
	
}
