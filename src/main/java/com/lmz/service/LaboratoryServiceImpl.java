package com.lmz.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmz.dao.LabExtendInfoMapper;
import com.lmz.dao.LaboratoryArrangementMapper;
import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;




@Service
public class LaboratoryServiceImpl implements LaboratoryService {
	
	@Autowired
	private LaboratoryArrangementMapper labArrangementMapper;
	
	@Autowired
	private LabExtendInfoMapper labExtendInfoMapper;

	@Override
	@Transactional
	public Integer save(LaboratoryArrangement record) {
	    LaboratoryArrangementExample example = new LaboratoryArrangementExample();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    LabExtendInfo labExtendInfo = new LabExtendInfo();
	    labExtendInfo.setLabExtendAmount(record.getLabPersonAmount());
	    labExtendInfo.setLabExtendCurrent(record.getLabPersonAmountNow());
	    labExtendInfo.setLabExtendName(record.getLabName());
	    labExtendInfo.setLabExtendPeriodTime(record.getTimePeriod());
	    labExtendInfo.setLabExtendTeacher(record.getLabTeacher());
	    example.createCriteria().andLabNameEqualTo(record.getLabName());
	    Long l = labArrangementMapper.countByExample(example);
	    System.out.println(record.getLabStartTime().toString());
	    String startTime1 = record.getLabStartTime();
	    String endTime1 = record.getLabEndTime();
	    Date startTime = null;
	    Date endTime = null;
        try {
            startTime = sdf.parse(startTime1);
            endTime = sdf.parse(endTime1);
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	    Long s = startTime.getTime();
	    Long e = endTime.getTime();
	    Long result = e-s;
	    System.out.println(result);
	    Integer timePeriod = record.getTimePeriod()*60*1000;
	    Long ptime = timePeriod.longValue();
	    Boolean btime = result >= ptime;
	    int i = l.intValue();
	    Long interval = Long.valueOf(10*1000*60);
	    System.err.println(btime);
	    if(i == 0 && btime){
	        labArrangementMapper.insertSelective(record);
	        Long firstTime = s;
	        Long lastTime = s+ptime;
	        labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	        labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	        labExtendInfoMapper.insertSelective(labExtendInfo);
	       while(lastTime<e){
	            firstTime = firstTime + interval;
	            lastTime = firstTime+ptime;
	            labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	            labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	            labExtendInfoMapper.insertSelective(labExtendInfo);
	        }
	    }
	    return i;

	}

	@Override
	public void delete(Integer id) {
	    labArrangementMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public Integer update(LaboratoryArrangement record) {
	    LaboratoryArrangementExample example = new LaboratoryArrangementExample();
      example.createCriteria().andLabNameEqualTo(record.getLabName());
      Long l = labArrangementMapper.countByExample(example);
      Integer i = l.intValue();
      if(i == 1){
          labArrangementMapper.updateByExampleSelective(record, example);
      }
      
      return i;
	   
		
	}

	@Override
	public List<LaboratoryArrangement> get(LaboratoryArrangementExample example) {
		
		return labArrangementMapper.selectByExample(example);
	}

}
