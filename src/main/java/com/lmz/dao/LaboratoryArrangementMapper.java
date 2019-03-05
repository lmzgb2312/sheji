package com.lmz.dao;

import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaboratoryArrangementMapper {
    long countByExample(LaboratoryArrangementExample example);

    long countByTime(LaboratoryArrangement record);
    long countByTime1(LaboratoryArrangement record);
    long countByTime2(LaboratoryArrangement record);
    Integer selectByTime(LaboratoryArrangement record);
    
    int deleteByExample(LaboratoryArrangementExample example);

    int deleteByPrimaryKey(Integer labId);

    int insert(LaboratoryArrangement record);

    int insertSelective(LaboratoryArrangement record);

    List<LaboratoryArrangement> selectByExample(LaboratoryArrangementExample example);

    LaboratoryArrangement selectByPrimaryKey(Integer labId);

    int updateByExampleSelective(@Param("record") LaboratoryArrangement record, @Param("example") LaboratoryArrangementExample example);

    int updateByExample(@Param("record") LaboratoryArrangement record, @Param("example") LaboratoryArrangementExample example);

    int updateByPrimaryKeySelective(LaboratoryArrangement record);

    int updateByPrimaryKey(LaboratoryArrangement record);
}