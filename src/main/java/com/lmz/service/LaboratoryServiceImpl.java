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
import com.lmz.vo.LabExtendInfoExample;
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
	    LaboratoryArrangementExample example1 = new LaboratoryArrangementExample();
	    LaboratoryArrangementExample example2 = new LaboratoryArrangementExample();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    LabExtendInfo labExtendInfo = new LabExtendInfo();
	    labExtendInfo.setLabExtendAmount(record.getLabPersonAmount());
	    labExtendInfo.setLabExtendCurrent(record.getLabPersonAmountNow());
	    labExtendInfo.setLabExtendName(record.getLabName());
	    labExtendInfo.setLabExtendPeriodTime(record.getTimePeriod());
	    labExtendInfo.setLabExtendTeacher(record.getLabTeacher());
	    //获取判断条件 只有插入的数据的结束时间小于数据库中数据的开始时间 或  插入数据的开始时间大于数据库数据的结束时间 
	    System.err.println(record.getLabStartTime());
	  
	    Long l = labArrangementMapper.countByTime2(record);
	    Long l1 = labArrangementMapper.countByTime1(record);
	    Long l2 = labArrangementMapper.countByTime(record);
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
	    int sig = 0;
	    int i = l.intValue();
	    int i1 = l1.intValue();
	    int i2 = l2.intValue();
	    Long interval = Long.valueOf(10*1000*60);
	    System.err.println(btime);
	    //根据时间间隔将时间段分成若干
	    if(i == 0 && btime && i1==0 && i2==0){
	        labArrangementMapper.insertSelective(record);
	        Long firstTime = s;
	        Long lastTime = firstTime+ptime;
	        labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	        labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	        labExtendInfoMapper.insertSelective(labExtendInfo);
	       while(lastTime<e){
	            firstTime = lastTime + interval;
	            lastTime = firstTime+ptime;
	            labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	            labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	            labExtendInfoMapper.insertSelective(labExtendInfo);
	        }
	       LabExtendInfoExample example3 = new LabExtendInfoExample();
	       example3.createCriteria().andLabExtendEndTimeGreaterThan(new Date(e));
	       labExtendInfoMapper.deleteByExample(example3);
	    }else if(btime == false){
	         sig = 2;
	    }else if(i!=0 || i1!=0 || i2!=0){
	         sig = 1;
	      }
	    return sig;

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
