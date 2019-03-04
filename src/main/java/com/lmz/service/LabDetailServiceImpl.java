package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.LabDetailMapper;
import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;

@Service
public class LabDetailServiceImpl implements LabDetailService {
    
    @Autowired
    private LabDetailMapper labDetailMapper;

    @Override
    public Integer save(LabDetail record) {

       LabDetailExample example = new LabDetailExample();
       example.createCriteria().andLabDetailNameEqualTo(record.getLabDetailName());
       Long l = labDetailMapper.countByExample(example);
       int i = l.intValue();
       if(i == 0){
           labDetailMapper.insertSelective(record);
       }
       return i;
    }

    @Override
    public void delete(Integer id) {

        labDetailMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Integer update(LabDetail record) {

        LabDetailExample example = new LabDetailExample();
        example.createCriteria().andLabDetailNameEqualTo(record.getLabDetailName());
        Long l = labDetailMapper.countByExample(example);
        Integer i = l.intValue();
        if(i == 1){
            labDetailMapper.updateByExampleSelective(record, example);
        }
        return  i;
        

    }

    @Override
    public List<LabDetail> get(LabDetailExample example) {

        return labDetailMapper.selectByExample(example);
    }

    /** 
     * @param id
     * @return
     * @see com.lmz.service.LabDetailService#queryOne(java.lang.Integer)
     */
    @Override
    public LabDetail queryOne(Integer id) {
        
       return labDetailMapper.selectByPrimaryKey(id);
       
    }

}
