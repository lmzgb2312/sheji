package com.lmz.dao;

import com.lmz.vo.LabReservation;
import com.lmz.vo.LabReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LabReservationMapper {
    long countByExample(LabReservationExample example);

    int deleteByExample(LabReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LabReservation record);

    int insertSelective(LabReservation record);

    List<LabReservation> selectByExample(LabReservationExample example);

    LabReservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LabReservation record, @Param("example") LabReservationExample example);

    int updateByExample(@Param("record") LabReservation record, @Param("example") LabReservationExample example);

    int updateByPrimaryKeySelective(LabReservation record);

    int updateByPrimaryKey(LabReservation record);
    
    @Select(" select count(*) from lab_reservation WHERE   lab_id = #{labId} and student_id = #{studentId} ")
    int countByLabIdAndStudentId(@Param("labId") Integer labId,@Param("studentId") String studentId);
}