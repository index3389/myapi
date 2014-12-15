package com.lala.myapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class AppController 
{
	@Autowired
	UserRepository userRepository;

	@ResponseBody
    @RequestMapping(value = "/v1/find_by_id", method = RequestMethod.GET)
    public Object find()
    {
		return userRepository.findOne(1);
    }
}
