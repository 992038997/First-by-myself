package org.boot.service;

import org.boot.Mapper.StudentMapper;
import org.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("studentService")
public class studentServiceImpl implements studentService {
	@Autowired
	@Qualifier("studentMapper")
	StudentMapper studentMapper;
	public studentServiceImpl() {
		super();
	}
	public studentServiceImpl(StudentMapper studentMapper) {
		super();
		this.studentMapper = studentMapper;
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	
	
	@Override
	public User queryUserByuserName(String userName) {
		// TODO Auto-generated method stub
		return studentMapper.queryUserByuserName(userName);
	}
	@Override
	public int deleteUserByuserName(String userName) {
		// TODO Auto-generated method stub
		return studentMapper.deleteUserByuserName(userName);
	}
	@Override
	public int updateUserByuserName(User user) {
		// TODO Auto-generated method stub
		return studentMapper.updateUserByuserName(user);
	}
	@Override
	public int insertUserByuserName(User user) {
		// TODO Auto-generated method stub
		return studentMapper.insertUserByuserName(user);
	}
	
	
	
	
}
