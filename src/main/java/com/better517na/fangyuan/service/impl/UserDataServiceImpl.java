package com.better517na.fangyuan.service.impl;

import com.better517na.fangyuan.business.IUserDataBusiness;
import com.better517na.fangyuan.exception.ValidIdException;
import com.better517na.fangyuan.model.bo.UserDataBo;
import com.better517na.fangyuan.service.IUserDataService;
import com.better517na.fangyuan.util.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataServiceImpl implements IUserDataService {

    private final IUserDataBusiness userDataBusiness;

    @Autowired
    public UserDataServiceImpl(IUserDataBusiness userDataBusiness) {
        this.userDataBusiness = userDataBusiness;
    }

    @Override
    public UserDataBo queryUserByUserId(String userId) throws Exception {
        if(!StringUtils.isValidKeyId(userId)){
            throw new ValidIdException("Valid ID");
        }
        return userDataBusiness.queryUserByUserId(userId);
    }

}