package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.PersonalInformationMapper;
import com.lmz.vo.PersonalInformation;
import com.lmz.vo.PersonalInformationExample;

@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {
    
    
    
    @Autowired
    private PersonalInformationMapper personalInformationMapper;

    /** 
     * @param studentId
     * @return
     * @see com.lmz.service.PersonalInformationService#queryOne(java.lang.String)
     */
    @Override
    public PersonalInformation queryOne(String studentId) {

        PersonalInformationExample example = new PersonalInformationExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        List<PersonalInformation> list = personalInformationMapper.selectByExample(example);
        PersonalInformation personalInformation = list.get(0);
        return personalInformation;
    }

    /** 
     * @param studentId
     * @see com.lmz.service.PersonalInformationService#updatePsw(java.lang.String)
     */
    @Override
    public void updatePsw(String studentId,String psw) {
        PersonalInformationExample example = new PersonalInformationExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        PersonalInformation record = new PersonalInformation();
        record.setStudentPassword(psw);
        personalInformationMapper.updateByExampleSelective(record, example);
        
        
    }

    
    
}
