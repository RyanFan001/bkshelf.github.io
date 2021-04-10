package com.yan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yan.dao.MovieDao;
import com.yan.entity.Pagination;
import com.yan.entity.Movie;

@Service
public class MovieService {
	 @Autowired
	 MovieDao movieDao;

	 public void getByPage(Pagination pagination,Movie Movie){
		List<Movie> list = movieDao.getByPage(pagination,Movie);
		pagination.setTotal(movieDao.getTotal(Movie));
		pagination.setRows(list);
	}
	public Movie searchById(int id) {
		return movieDao.searchById(id);
	}
	public int insert(Movie r) {
		return movieDao.insert(r);
	}
	public int updateById(Movie r) {
		return movieDao.updateById(r);
	}
	public int delete(Integer id) {
		return movieDao.delete(id);
	}
	
}
