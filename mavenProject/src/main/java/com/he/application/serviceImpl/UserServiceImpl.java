package com.he.application.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.he.application.dao.UserMapper;
import com.he.application.domain.User;
import com.he.application.service.UserService;
/**
 * 用户业务控制层
 * @author Administrator
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询所有用户
	 */
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}

	@Override
	public boolean addUser(User usr) {
		
		return userMapper.addUser(usr);
	}
	
	
	

}
