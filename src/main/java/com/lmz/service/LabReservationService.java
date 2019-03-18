package com.lmz.service;


import java.util.List;

import com.lmz.vo.LabReservation;

public interface LabReservationService {
    
    
    Integer save(LabReservation record);
    
    Integer delete(String studentId,Integer labId);
    
    List<LabReservation> get(String studentId);
    
    //Integer total(String studentId,Integer labId);

}
