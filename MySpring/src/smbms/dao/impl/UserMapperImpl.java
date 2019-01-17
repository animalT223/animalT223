package smbms.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import smbms.dao.UserMapper;
import smbms.entity.User;

public class UserMapperImpl implements UserMapper{
	private SqlSessionTemplate sqlSession;

	public List<User> getUserList(User user) {
		return sqlSession.getMapper(UserMapper.class).getUserList(user);
	}
	
	public SqlSessionTemplate getSqlSession(){
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
}
