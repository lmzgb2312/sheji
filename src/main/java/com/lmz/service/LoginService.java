/**
 *
 * Copyright (C), 2011-2019, 微贷网.
 */
package com.lmz.service;

import java.util.List;

import com.lmz.vo.LoginPermissions;

/**
 *
 * @author limingzhe WD49903
 * @version $Id: LoginService.java, v 0.1 2019年3月26日 上午10:00:03 limingzhe WD49903 Exp $
 */
public interface LoginService {

    List<LoginPermissions> getOne(String userName);
    
    
}
