package com.he.serviceImpl;




import com.he.dao.UserMapper;
import com.he.domain.User;
import com.he.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 用户业务控制层
 * @author Administrator
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
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
