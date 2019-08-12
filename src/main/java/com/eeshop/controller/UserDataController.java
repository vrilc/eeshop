package com.better517na.fangyuan.controller;

import com.better517na.fangyuan.dao.IUserDataDao;
import com.better517na.fangyuan.exception.ValidIdException;
import com.better517na.fangyuan.model.Response;
import com.better517na.fangyuan.model.bo.UserDataBo;
import com.better517na.fangyuan.service.IUserDataService;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserDataController extends BaseController{

  @Autowired
    private IUserDataService userDateService; 
  @Autowired
    private IUserDataDao userDataDao;

  @ApiOperation(value = "queryUser",notes = "say hello world")
  @GetMapping("/queryUser")
 public Response<UserDataBo> queryUser(@RequestParam(required = true) String userId) {
    Response<UserDataBo> response = null;
    try {
      UserDataBo res  = userDateService.queryUserByuserId(userId);
      response = toSuccess(res);
    } catch (ValidIdException e) {
      e.printStackTrace();
      response = toFailure(e.getMessage());
    } catch(Exception e){
        e.printStackTrace();
        response = toFailure(e.getMessage());
    }finally{

    }
        return response;
    }
    @ApiOperation(value = "delete",notes = "say hello world")
    @GetMapping("/deleteUser")
    public Response<Integer> deleteUser(@RequestParam(required = true) String userId){
        Response <Integer> response= null;
        try {
            Integer res  = userDataDao.delete(userId);
        response = toSuccess(res);
        }  catch(Exception e){
            e.printStackTrace();
          response = toFailure(e.getMessage());
      }finally{
  
      }
      return response;
      }
    @ApiOperation(value = "addUser",notes = "say hello world")
    @GetMapping("/addUser")
    public Response<Integer> addUser(@RequestParam(required = true) String userId,@RequestParam(required = true) String userName){
        Response<Integer> response= null;
        try {
            Integer res = userDataDao.insert(userId,userName);
            response = toSuccess(res);
        } catch(Exception e){
            e.printStackTrace();
            response = toFailure(e.getMessage());
        }finally{

        }
        return response;
    }
    @ApiOperation(value = "updateUser",notes = "say hello world")
    @GetMapping("/updateUser")
    public Response<Integer> updateUser(@RequestParam(required = true) String userId,@RequestParam(required = true) String userName){
        Response<Integer> response= null;
        try {
            Integer res  = userDataDao.update(userId,userName);
            response = toSuccess(res);
        }  catch(Exception e){
            e.printStackTrace();
            response = toFailure(e.getMessage());
        }finally{

        }
        return response;
    }


}