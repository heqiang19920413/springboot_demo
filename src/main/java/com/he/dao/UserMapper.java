package com.he.dao;

import com.he.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
