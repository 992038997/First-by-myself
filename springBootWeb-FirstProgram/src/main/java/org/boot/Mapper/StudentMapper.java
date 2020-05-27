package org.boot.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.boot.entity.User;

@Mapper
public interface StudentMapper {
	public User queryUserByuserName(String userName);
	
	public int deleteUserByuserName(String userName);
	
	public int updateUserByuserName(User user);
	
	public int insertUserByuserName(User user);
	
}
