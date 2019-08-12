package com.better517na.fangyuan.business.impl;


import javax.annotation.Resource;

import com.better517na.fangyuan.business.IUserDataBusiness;
import com.better517na.fangyuan.dao.IUserDataDao;
import com.better517na.fangyuan.model.bo.UserDataBo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IUserDataBusinessImpl implements IUserDataBusiness{

    @Resource
    private IUserDataDao userDataDao;

    public UserDataBo queryUserByUserId(String userId) throws Exception {
        UserDataBo userDataBo = userDataDao.queryUserByUserId(userId);
        if(null==userDataBo){
            throw new Exception("user [" + userId + "] not found");
        }
        return userDataBo;
    }
}