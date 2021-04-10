package com.yan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.dao.CategoryDao;
import com.yan.entity.Article;
import com.yan.entity.Category;
import com.yan.entity.Pagination;

@Service
public class CategoryService {
	@Autowired
	CategoryDao categoryDao;

	public void getList(Pagination<Category> pagination){
		List<Category> list = categoryDao.getList(pagination);
		pagination.setTotal(categoryDao.getTotal());
		pagination.setRows(list);
	}
	
	public int insert(Category r) {
		return categoryDao.insert(r);
	}
	public int update(Category r) {
		return categoryDao.update(r);
	}
	public int delete(Integer id) {
		return categoryDao.delete(id);
	}
	
	public List<Category> getByState(Integer state){
		return categoryDao.getByState(state);
	}
}
