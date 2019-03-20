package com.lmz.dao;

import com.lmz.vo.PersonalInformation;
import com.lmz.vo.PersonalInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalInformationMapper {
    long countByExample(PersonalInformationExample example);

    int deleteByExample(PersonalInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonalInformation record);

    int insertSelective(PersonalInformation record);

    List<PersonalInformation> selectByExample(PersonalInformationExample example);

    PersonalInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonalInformation record, @Param("example") PersonalInformationExample example);

    int updateByExample(@Param("record") PersonalInformation record, @Param("example") PersonalInformationExample example);

    int updateByPrimaryKeySelective(PersonalInformation record);

    int updateByPrimaryKey(PersonalInformation record);
}