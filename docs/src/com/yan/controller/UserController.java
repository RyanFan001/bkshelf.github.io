package com.yan.controller;


import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.yan.entity.User;
import com.yan.entity.Pagination;
import com.yan.service.UserService;

/**
 * user
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    
    /**
     * get by page
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value="/getByPage",method= RequestMethod.GET,
			produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getByPage(Integer page,Integer limit,HttpServletRequest request) {
		Pagination<User> pagination = new Pagination<User>(page, limit);
		userService.getByPage(pagination);
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
    	int result = userService.delete(id);
    	return result;
	}
    /**
           * edit
     * @param obj
     * @return
     */
    @RequestMapping("edit")
    @ResponseBody
	public int edit(User obj) {
    	int result = userService.updateById(obj);
    	return result;
	}
    /**
     * add
     * @param obj
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
	public int add(User obj) {
    	int result = userService.insert(obj);
    	return result;
	}
    
    @RequestMapping("/login")
    @ResponseBody
	public HashMap<Object, Object> login(User a,HttpServletRequest request){
    	HashMap<Object, Object> map = new HashMap<>();
    	//Service
    	User user = userService.login(a);
    	//login successful
    	if(user != null){
    		HttpSession session = request.getSession();
    		session.setAttribute("reader",user);
    		map.put("code", 1);
    		map.put("msg", "login successful");
    		map.put("data", user);
			return map;
    	//login failed
    	}else{
    		map.put("code", 10);
    		map.put("msg", "username or password incorect");
			return map;
    	}
    }
    
    /**
     * get by id
     * @param id
     * @return
     */
    @RequestMapping("getById")
    @ResponseBody
	public User getById(Integer id){
    	User a = userService.searchById(id);
    	return a;
    }
}