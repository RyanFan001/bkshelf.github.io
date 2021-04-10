package com.yan.dao;

import java.util.List;

import com.yan.entity.Article;
import com.yan.entity.Category;
import com.yan.entity.Pagination;

public interface CategoryDao {
	List<Category> getList(Pagination<Category> p);
	long getTotal();
	int insert(Category b);
	int update(Category b);
	int delete(Integer id);
	List<Category> getByState(Integer type);
}