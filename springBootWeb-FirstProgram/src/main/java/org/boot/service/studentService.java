package org.boot.service;

import org.boot.entity.User;

public interface studentService {
	public User queryUserByuserName(String userName);
	
	public int deleteUserByuserName(String userName);
	
	public int updateUserByuserName(User user);
	
	public int insertUserByuserName(User user);
	
}
