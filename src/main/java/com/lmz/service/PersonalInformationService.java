package com.lmz.service;

import com.lmz.vo.PersonalInformation;

public interface PersonalInformationService {
    
    PersonalInformation queryOne(String studentId);
    
    
    void updatePsw(String studentId,String psw);

}
