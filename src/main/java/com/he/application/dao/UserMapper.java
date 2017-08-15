package com.he.application.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.he.application.domain.User;

/**
 * 用户业务持久层
 * @author Administrator
 *
 */
@Mapper

public interface UserMapper {
	
	 /**
	   * 查询所有用户
	   * @return
	   */
	  List<User> findAll();
	  
	  boolean addUser(User usr);

}
