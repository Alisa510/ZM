package com.zm.erp.modules.account.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.zm.erp.modules.account.entity.User;

@Repository
@Mapper
public interface AccountDao {
	
	@Insert("insert user(account, password, user_status) values(#{account}, #{password}, #{userStatus})")
	@Options(useGeneratedKeys=true,keyColumn="user_id",keyProperty="userId")
	void insertUser(User user);
	
	@Select("select * from user where account = #{account}")
	User getUserByName(String account);

}
