package com.lmz.dao;

import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabDetailMapper {
    long countByExample(LabDetailExample example);

    int deleteByExample(LabDetailExample example);

    int deleteByPrimaryKey(Integer labDetailId);

    int insert(LabDetail record);

    int insertSelective(LabDetail record);

    List<LabDetail> selectByExample(LabDetailExample example);

    LabDetail selectByPrimaryKey(Integer labDetailId);

    int updateByExampleSelective(@Param("record") LabDetail record, @Param("example") LabDetailExample example);

    int updateByExample(@Param("record") LabDetail record, @Param("example") LabDetailExample example);

    int updateByPrimaryKeySelective(LabDetail record);

    int updateByPrimaryKey(LabDetail record);
}