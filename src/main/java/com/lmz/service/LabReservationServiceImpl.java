package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.LabExtendInfoMapper;
import com.lmz.dao.LabReservationMapper;
import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LabReservation;
import com.lmz.vo.LabReservationExample;

@Service
public class LabReservationServiceImpl implements LabReservationService {
    
    
    
    @Autowired
    private LabReservationMapper labReservationMapper;
 
    @Autowired
    private LabExtendInfoMapper labExtendInfoMapper;
    
    /** 
     * @param record
     * @see com.lmz.service.LabReservationService#save(com.lmz.vo.LabReservation)
     */
    @Override
    public Integer save(LabReservation record) {

        Integer count = 0;
        Integer i = labReservationMapper.countByLabIdAndStudentId(record.getLabId(), record.getStudentId());
        LabExtendInfo info = labExtendInfoMapper.selectByPrimaryKey(record.getLabId());
        LabReservation labReservation1 = new LabReservation();
        LabReservationExample example =new LabReservationExample();
        example.createCriteria().andLabIdEqualTo(record.getLabId());
        if(i==0 && info.getLabExtendCurrent()+1<=info.getLabExtendAmount()){
            LabExtendInfo labExtendInfo = new LabExtendInfo();
            labExtendInfo.setId(record.getLabId());
            labExtendInfo.setLabExtendCurrent(info.getLabExtendCurrent()+1);
            record.setLabCurrent(info.getLabExtendCurrent()+1);
            labExtendInfoMapper.updateByPrimaryKeySelective(labExtendInfo);
            labReservation1.setLabCurrent(info.getLabExtendCurrent()+1);
            labReservationMapper.insertSelective(record);
            labReservationMapper.updateByExampleSelective(labReservation1, example);
        }else if(i!=0){
            count = 1;
        }else if(i == 0 && info.getLabExtendCurrent()+1>=info.getLabExtendAmount()){
            count = 2;
        }
        
        return count;
        
    }

    /** 
     * @param studentId
     * @param labId
     * @see com.lmz.service.LabReservationService#delete(java.lang.String, java.lang.Integer)
     */
    @Override
    public Integer delete(String studentId, Integer labId) {

        
    
       Integer i = labReservationMapper.countByLabIdAndStudentId(labId, studentId);
       if(i==1){
           labReservationMapper.deleteByLabIdAndStudentId(labId, studentId); 
       }
       
        return i;
    }

    /** 
     * @param studentId
     * @return
     * @see com.lmz.service.LabReservationService#get(java.lang.String)
     */
    @Override
    public List<LabReservation> get(String studentId) {

        // TODO Auto-generated method stub
        LabReservationExample example = new LabReservationExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        return labReservationMapper.selectByExample(example);
    }

    /** 
     * @param labName
     * @param studentId
     * @return
     * @see com.lmz.service.LabReservationService#getByLabNameAndSId(java.lang.String, java.lang.String)
     */
    @Override
    public List<LabReservation> getByLabNameAndSId(String labName, String studentId) {

        // TODO Auto-generated method stub
        return labReservationMapper.getByLabNameAndSId(labName, studentId);
    }

}
