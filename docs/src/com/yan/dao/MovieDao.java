package com.yan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yan.entity.Pagination;
import com.yan.entity.Movie;

public interface MovieDao {
	List<Movie> getByPage(@Param("p")Pagination<Movie> p,@Param("movie")Movie movie);
	long getTotal(Movie movie);
	Movie searchById(int id);
	int insert(Movie b);
	int updateById(Movie b);
	int delete(Integer id);
	List<Movie> getIdByState();
}