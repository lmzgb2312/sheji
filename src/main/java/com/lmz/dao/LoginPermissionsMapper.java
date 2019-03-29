package com.lmz.dao;

import com.lmz.vo.LoginPermissions;
import com.lmz.vo.LoginPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginPermissionsMapper {
    long countByExample(LoginPermissionsExample example);

    int deleteByExample(LoginPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginPermissions record);

    int insertSelective(LoginPermissions record);

    List<LoginPermissions> selectByExample(LoginPermissionsExample example);

    LoginPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginPermissions record, @Param("example") LoginPermissionsExample example);

    int updateByExample(@Param("record") LoginPermissions record, @Param("example") LoginPermissionsExample example);

    int updateByPrimaryKeySelective(LoginPermissions record);

    int updateByPrimaryKey(LoginPermissions record);
}