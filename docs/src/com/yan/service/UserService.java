package com.yan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yan.dao.UserDao;
import com.yan.entity.Pagination;
import com.yan.entity.User;

@Service
public class UserService {
	 @Autowired
	 UserDao userDao;

	 public void getByPage(Pagination pagination){
		List<User> list = userDao.getByPage(pagination);
		pagination.setTotal(userDao.getTotal());
		pagination.setRows(list);
	}
	public User searchById(int id) {
		return userDao.searchById(id);
	}
	public int insert(User r) {
		return userDao.insert(r);
	}
	public int updateById(User r) {
		return userDao.updateById(r);
	}
	public int delete(Integer id) {
		return userDao.delete(id);
	}
	public User login(User user){
		return userDao.login(user);
	}
}
