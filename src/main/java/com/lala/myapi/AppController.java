package com.lala.myapi;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制器
 * @author ly
 * Create Time: 2014-12-28
 */

@Controller
@RequestMapping("/api")
public class AppController 
{
	@Autowired
	UserRepository userRepository;

	@ResponseBody
    @RequestMapping(value = "/v1/user/find_by_id", method = RequestMethod.GET)
    public Object find(HttpServletRequest request)
    {
		String id = request.getParameter("id");
		if(id == null || id.trim().length() < 1)
		{
			return null;
		}
		return userRepository.findOne(Integer.valueOf(id));
    }
}
