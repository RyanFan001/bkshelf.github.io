package com.yan.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yan.entity.Article;
import com.yan.entity.Category;
import com.yan.entity.Pagination;
import com.yan.entity.User;
import com.yan.service.CategoryService;

/**
 * movie type
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    
    /**
      * get type list
     * @return
     */
    @RequestMapping(value="/getCategoryList",method= RequestMethod.GET,
			produces="text/html;charset=UTF-8")
    @ResponseBody
	public String getCategoryList() {
    	Pagination<Category> pagination = new Pagination<Category>(1,10);
    	categoryService.getList(pagination);
    	Gson gson = new Gson();
		String json = gson.toJson(pagination);
		return json;
	}
 
    
}