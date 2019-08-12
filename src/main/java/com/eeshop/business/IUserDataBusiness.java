package 

import com.better517na.fangyuan.model.bo.UserDataBo;

public interface IUserDataBusiness {
    
    public UserDataBo queryUserByuserId(String userId) throws Exception;

}