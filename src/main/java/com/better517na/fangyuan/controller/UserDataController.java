package com.better517na.fangyuan.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.better517na.fangyuan.dao.IUserDataDao;
import com.better517na.fangyuan.model.Response;
import com.better517na.fangyuan.model.bo.UserDataBo;
import com.better517na.fangyuan.service.IUserDataService;
import io.swagger.annotations.ApiOperation;


@RestController
public class UserDataController extends BaseController {

    private final IUserDataService userDateService;
    @Resource
    private IUserDataDao userDataDao;

    @Autowired
    public UserDataController(IUserDataService userDateService) {
        this.userDateService = userDateService;
    }

    @ApiOperation(value = "queryUser", notes = "say hello world")
    @GetMapping("/queryUser")
    public Response<UserDataBo> queryUser(@RequestParam String userId) {
        Response<UserDataBo> response;
        try {
            UserDataBo res = userDateService.queryUserByUserId(userId);
            response = toSuccess(res);
        } catch (Exception e) {
            e.printStackTrace();
            response = toFailure(e.getMessage());
        } finally {

        }
        return response;
    }

    @ApiOperation(value = "delete", notes = "say hello world")
    @GetMapping("/deleteUser")
    public Response<Integer> deleteUser(@RequestParam String userId) {
        Response<Integer> response;
        try {
            Integer res = userDataDao.delete(userId);
            response = toSuccess(res);
        } catch (Exception e) {
            e.printStackTrace();
            response = toFailure(e.getMessage());
        } finally {

        }
        return response;
    }

    @ApiOperation(value = "addUser", notes = "say hello world")
    @GetMapping("/addUser")
    public Response<Integer> addUser(@RequestParam String userId, @RequestParam String userName) {
        Response<Integer> response;
        try {
            Integer res = userDataDao.insert(userId, userName);
            response = toSuccess(res);
        } catch (Exception e) {
            e.printStackTrace();
            response = toFailure(e.getMessage());
        } finally {

        }
        return response;
    }

    @ApiOperation(value = "updateUser", notes = "say hello world")
    @GetMapping("/updateUser")
    public Response<Integer> updateUser(@RequestParam String userId, @RequestParam String userName) {
        Response<Integer> response;
        try {
            Integer res = userDataDao.update(userId, userName);
            response = toSuccess(res);
        } catch (Exception e) {
            e.printStackTrace();
            response = toFailure(e.getMessage());
        } finally {

        }
        return response;
    }


}