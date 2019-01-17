package smbms.service;

import java.util.List;

import smbms.entity.User;

public interface UserService {
	public List<User> findUsersWithConditions(User user);
}
