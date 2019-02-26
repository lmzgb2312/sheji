package com.lmz.dao;

import com.lmz.vo.CourseArrangement;
import com.lmz.vo.CourseArrangementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseArrangementMapper {
    long countByExample(CourseArrangementExample example);

    int deleteByExample(CourseArrangementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseArrangement record);

    int insertSelective(CourseArrangement record);

    List<CourseArrangement> selectByExample(CourseArrangementExample example);

    CourseArrangement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseArrangement record, @Param("example") CourseArrangementExample example);

    int updateByExample(@Param("record") CourseArrangement record, @Param("example") CourseArrangementExample example);

    int updateByPrimaryKeySelective(CourseArrangement record);

    int updateByPrimaryKey(CourseArrangement record);
}