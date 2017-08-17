package com.he.application.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.he.application.domain.User;
import com.he.application.service.UserService;
/**
 * 用户控制层
 * @author Administrator
 *
 */
@Controller
public class UserController{

	@Autowired
	private UserService userService;
	
	private static Logger log = Logger.getLogger(UserController.class);

	/**
	 * 查询所有用户
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/findAllUserList")
	public String  findAllUserList(ModelMap map){
		List<User> userList=userService.findAll();
		map.addAttribute("userList", userList);
		return "userList";
	}
	
	
	@RequestMapping(value="/skipTest")
	public String skipTest(){
	System.out.println("TIAOASDLFJSDLFD");
		return "user";
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(){
		User usr = new User();
		usr.setAge(23);
		usr.setId("454d");
		usr.setName("贺强");
		try{
			boolean b =userService.addUser(usr);
			if(!b){
				return "faill";
			}else{
				return "success";
			}
		}catch(Exception e){
			log.error("UserController中addUser方法执行出现异常！" + e.toString());
			
		}
		return null;
	}
	
}
