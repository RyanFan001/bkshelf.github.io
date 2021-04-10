package com.yan.dao;

import java.util.List;

import com.yan.entity.Pagination;
import com.yan.entity.User;

public interface UserDao {
	List<User> getByPage(Pagination<User> p);
	long getTotal();
	User searchById(int id);
	int insert(User user);
	int updateById(User user);
	int delete(Integer id);
	User login(User user);
}