package smbms.dao;

import java.util.List;

import smbms.entity.User;

public interface UserMapper {
	public List<User> getUserList(User user);
}
