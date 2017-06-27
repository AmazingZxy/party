package org.party.zxy.service;

import java.util.List;

import org.party.zxy.domain.User;
import org.party.zxy.util.tag.PageModel;

public interface UserService {
	
	/**
	 * 用户登录
	 * @param  loginname
	 * @param  password
	 * @return User对象
	 * */
	User login(String loginname,String password);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return 用户对象
	 * */
	User findUserById(Integer id);
	
	/**
	 * 获得所有用户
	 * @return User对象的List集合
	 * */
	List<User> findUser(User user,PageModel pageModel);
	
	/**
	 * 根据id删除用户
	 * @param id
	 * */
	void removeUserById(Integer id);
	
	/**
	 * 修改用户
	 * @param User 用户对象
	 * */
	void modifyUser(User user);
	
	/**
	 * 添加用户
	 * @param User 用户对象
	 * */
	void addUser(User user);
}
