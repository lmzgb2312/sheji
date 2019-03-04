package com.lmz.dao;

import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LabExtendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabExtendInfoMapper {
    long countByExample(LabExtendInfoExample example);
    

    int deleteByExample(LabExtendInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LabExtendInfo record);

    int insertSelective(LabExtendInfo record);

    List<LabExtendInfo> selectByExample(LabExtendInfoExample example);

    LabExtendInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LabExtendInfo record, @Param("example") LabExtendInfoExample example);

    int updateByExample(@Param("record") LabExtendInfo record, @Param("example") LabExtendInfoExample example);

    int updateByPrimaryKeySelective(LabExtendInfo record);

    int updateByPrimaryKey(LabExtendInfo record);
}