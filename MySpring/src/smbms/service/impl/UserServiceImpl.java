package smbms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smbms.dao.UserMapper;
import smbms.entity.User;
import smbms.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;//声明UserMapper接口引用

	public List<User> findUsersWithConditions(User user) {
		try {
			return userMapper.getUserList(user);
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
