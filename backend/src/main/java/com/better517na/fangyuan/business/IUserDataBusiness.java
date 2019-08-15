package com.better517na.fangyuan.business;

import com.better517na.fangyuan.model.bo.UserDataBo;

public interface IUserDataBusiness {

     UserDataBo queryUserByUserId(String userId) throws Exception;

}