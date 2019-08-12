package com.better517na.fangyuan.business.impl;


import com.better517na.fangyuan.business.IUserDataBusiness;
import com.better517na.fangyuan.dao.IUserDataDao;
import com.better517na.fangyuan.model.bo.UserDataBo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IUserDataBusinessImpl implements IUserDataBusiness{

    @Autowired
    private IUserDataDao userDataDao;

    public UserDataBo queryUserByuserId(String userId) throws Exception{
        UserDataBo userDataBo = userDataDao.queryUserByuserId(userId);
        if(null==userDataBo){
            throw new Exception("not found");
        }
        return userDataBo;
    }
}