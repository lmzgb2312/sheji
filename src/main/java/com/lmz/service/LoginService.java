
package com.lmz.service;

import java.util.List;

import com.lmz.vo.LoginPermissions;


public interface LoginService {

    List<LoginPermissions> getOne(String userName);
    
    
}
