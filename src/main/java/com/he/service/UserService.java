package com.he.service;



import com.he.domain.User;

import java.util.List;



/**
 * 用户业务接口
 * @author Administrator
 *
 */
public interface UserService {
	  /**
	   * 查询所有用户
	   * @return
	   */
	  List<User> findAll();

	boolean addUser(User usr);
	

}
