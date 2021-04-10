package com.yan.controller;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.yan.entity.Article;
import com.yan.entity.Movie;
import com.yan.entity.Pagination;
import com.yan.service.MovieService;

/**
 * movie
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;
    
    /**
     *  get vedio type
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value="/getMovieList",method= RequestMethod.GET,
			produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getMovieList(Movie Movie,HttpServletRequest request) {
		Pagination<Movie> pagination = new Pagination<Movie>(1,100);
		movieService.getByPage(pagination,Movie);
		Gson gson = new Gson();
		String json = gson.toJson(pagination);
		return json;
		
	}
 
    
    /**
     * delete
     * @param id
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
	public int delete(int id) {
    	int result = movieService.delete(id);
    	return result;
	}
    /**
     * edit
     * @param movie
     * @return
     */
    @RequestMapping("edit")
    @ResponseBody
	public int edit(Movie obj,HttpServletRequest request) {
        int result = movieService.updateById(obj);
    	return result; 
	}
    /**
     * add
     * @param movie
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
	public int add(Movie obj,HttpServletRequest request) {
        int result = movieService.insert(obj);
    	return result; 
    	
	}
    
    /**
     * id information
     * @param id
     * @return
     */
    @RequestMapping("getById")
    @ResponseBody
	public Movie getById(Integer id){
    	Movie a = movieService.searchById(id);
    	return a;
    }
    
}