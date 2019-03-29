package com.lmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmz.dao.LoginPermissionsMapper;
import com.lmz.vo.LoginPermissions;
import com.lmz.vo.LoginPermissionsExample;

@Service
public class LoginServiceImpl implements LoginService {
    
    
    
    @Autowired
    private LoginPermissionsMapper loginPermissionsMapper;

    @Override
    public List<LoginPermissions> getOne(String userName) {

        LoginPermissionsExample example = new LoginPermissionsExample();
        example.createCriteria().andUsernameEqualTo(userName);
        List<LoginPermissions> list = loginPermissionsMapper.selectByExample(example);
        return list;
    }

}
