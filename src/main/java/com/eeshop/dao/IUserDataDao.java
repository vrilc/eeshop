package com.better517na.fangyuan.dao;


import com.better517na.fangyuan.model.bo.UserDataBo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface IUserDataDao {
	@Select("SELECT * FROM user WHERE KeyId = ${id}")
	UserDataBo queryUserByuserId(@Param("id") String id);

	@Delete("DELETE FROM user WHERE KeyId=${id}")
	Integer delete(@Param("id") String id);

	@Update("UPDATE user SET UserName=$name WHERE KeyId = ${id}")
	Integer update(@Param("id") String id,@Param("name")String name);

	@Insert("INSERT INTO user (`KeyId`, `UserName`) VALUES(#{id},#{name})")
	Integer insert(@Param("id") String id,@Param("name")String name);
}