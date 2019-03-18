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
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    LabExtendInfo labExtendInfo = new LabExtendInfo();
	    labExtendInfo.setLabExtendAmount(record.getLabPersonAmount());
	    labExtendInfo.setLabExtendCurrent(record.getLabPersonAmountNow());
	    labExtendInfo.setLabExtendName(record.getLabName());
	    labExtendInfo.setLabExtendPeriodTime(record.getTimePeriod());
	    labExtendInfo.setLabExtendTeacher(record.getLabTeacher());
	    labExtendInfo.setUid(record.getLabId());
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
	        Integer id = labArrangementMapper.selectByTime(record);
	        Long firstTime = s;
	        Long lastTime = firstTime+ptime;
	        labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	        labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	        labExtendInfo.setUid(id);
	        labExtendInfoMapper.insertSelective(labExtendInfo);
	       while(lastTime<e){
	            firstTime = lastTime + interval;
	            lastTime = firstTime+ptime;
	            labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
	            labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
	            labExtendInfo.setUid(id);
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
	@Transactional
	public void delete(Integer id) {
	     LabExtendInfoExample example = new LabExtendInfoExample();
	      example.createCriteria().andUidEqualTo(id);
	      labExtendInfoMapper.deleteByExample(example);
	      labArrangementMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	@Transactional
	public Integer update(LaboratoryArrangement record) {
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    LaboratoryArrangement laboratoryArrangement = labArrangementMapper.selectByPrimaryKey(record.getLabId());
	try {
	    Boolean a = !record.getLabStartTime().equals(sdf.format(sdf.parse(laboratoryArrangement.getLabStartTime())));
	    Boolean b = !record.getLabEndTime().equals(sdf.format(sdf.parse(laboratoryArrangement.getLabEndTime())));
	    System.out.println(a);
	    System.out.println(b);
         if(a || b){
             LaboratoryArrangement record1 = new LaboratoryArrangement();
             record1.setGmtCreated(record.getGmtCreated());
             record1.setLabId(record.getLabId());
             record1.setLabStartTime("1900-01-01 00:00:00");
             record1.setLabEndTime("1900-01-02 00:00:00");
             labArrangementMapper.updateByPrimaryKeySelective(record1);
             LabExtendInfo labExtendInfo = new LabExtendInfo();
             labExtendInfo.setLabExtendAmount(record.getLabPersonAmount());
             labExtendInfo.setLabExtendCurrent(record.getLabPersonAmountNow());
             labExtendInfo.setLabExtendName(record.getLabName());
             labExtendInfo.setLabExtendPeriodTime(record.getTimePeriod());
             labExtendInfo.setLabExtendTeacher(record.getLabTeacher());
             labExtendInfo.setUid(record.getLabId());
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
                 LabExtendInfoExample example = new LabExtendInfoExample();
                 example.createCriteria().andUidEqualTo(record.getLabId());
                 labArrangementMapper.updateByPrimaryKeySelective(record);
                 example.createCriteria().andUidEqualTo(record.getLabId());
                 Long firstTime = s;
                 Long lastTime = firstTime+ptime;
                 labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
                 labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
                 labExtendInfo.setUid(record.getLabId());
                 labExtendInfoMapper.deleteByExample(example);
                 labExtendInfoMapper.insertSelective(labExtendInfo);
                while(lastTime<e){
                     firstTime = lastTime + interval;
                     lastTime = firstTime+ptime;
                     labExtendInfo.setLabExtendStartTime(sdf.format(firstTime));
                     labExtendInfo.setLabExtendEndTime(sdf.format(lastTime));
                     labExtendInfo.setUid(record.getLabId());
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
         }else{
             LabExtendInfoExample example = new LabExtendInfoExample();
             example.createCriteria().andUidEqualTo(record.getLabId());
             LabExtendInfo labExtendInfo = new LabExtendInfo();
             labExtendInfo.setLabExtendAmount(record.getLabPersonAmount());
             labExtendInfo.setLabExtendCurrent(record.getLabPersonAmountNow());
             labExtendInfo.setLabExtendName(record.getLabName());
             labExtendInfo.setLabExtendPeriodTime(record.getTimePeriod());
             labExtendInfo.setLabExtendTeacher(record.getLabTeacher());
             labArrangementMapper.updateByPrimaryKeySelective(record); 
             labExtendInfoMapper.updateByExampleSelective(labExtendInfo, example);
             return 0;
         }
    } catch (ParseException e2) {
        // TODO Auto-generated catch block
        e2.printStackTrace();
    }
	  
return null;
	    
		
	}

	@Override
	public List<LaboratoryArrangement> get(LaboratoryArrangementExample example) {
		
		return labArrangementMapper.selectByExample(example);
	}
	
	@Override
  public LaboratoryArrangement queryOne(Integer id) {
	   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   LaboratoryArrangement laboratoryArrangement = labArrangementMapper.selectByPrimaryKey(id);
	   String startTime;
	   String endTime;
    try {
        startTime = sdf.format(sdf.parse(laboratoryArrangement.getLabStartTime()));
         endTime = sdf.format(sdf.parse(laboratoryArrangement.getLabEndTime()));
         laboratoryArrangement.setLabStartTime(startTime);
         laboratoryArrangement.setLabEndTime(endTime);
         return laboratoryArrangement;
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return null;
	   
  }

    /** 
     * @param id
     * @return
     * @see com.lmz.service.LaboratoryService#queryInfo(java.lang.Integer)
     */
    @Override
    public List<LabExtendInfo> queryInfo(Integer id) {
        
        LabExtendInfoExample example = new LabExtendInfoExample();
        example.createCriteria().andUidEqualTo(id);
        return   labExtendInfoMapper.selectByExample(example);
        
    }

    /** 
     * @param example
     * @return
     * @see com.lmz.service.LaboratoryService#get1(com.lmz.vo.LabExtendInfoExample)
     */
    @Override
    public List<LabExtendInfo> get1(LabExtendInfoExample example) {

        // TODO Auto-generated method stub
        return labExtendInfoMapper.selectByExample(example);
    }

    /** 
     * @param example
     * @return
     * @see com.lmz.service.LaboratoryService#get(com.lmz.vo.LabExtendInfoExample)
     */
    @Override
    public List<LabExtendInfo> getExtendAll(LabExtendInfoExample example) {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<LabExtendInfo> list = labExtendInfoMapper.selectByExample(example);
        for(LabExtendInfo info : list){
            try {
                info.setLabExtendStartTime(sdf.format(sdf.parse(info.getLabExtendStartTime())));
                info.setLabExtendEndTime(sdf.format(sdf.parse(info.getLabExtendEndTime())));;
            
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }  
            return list;
    }

}
