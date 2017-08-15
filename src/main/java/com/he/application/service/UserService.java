package com.he.application.service;



import java.util.List;

import com.he.application.domain.User;

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
