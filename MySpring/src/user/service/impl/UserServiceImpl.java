package user.service.impl;

import user.dao.UserDao;
import user.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public void addNewUser() {
		System.out.println("Service保存用户信息");
		dao.saveNewUser();
	}

}
