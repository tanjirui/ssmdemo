package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.User;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;

/**
 * 服务实现类
 * @author lenovo
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	/**
	 * 注入usermapper接口
	 */
	@Autowired
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);

	}

	@Override
	public boolean updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public boolean deleteUser(int id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public User findUserById(int id) {
		return userMapper.findUserById(id);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
