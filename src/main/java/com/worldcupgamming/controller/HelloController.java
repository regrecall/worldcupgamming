package com.worldcupgamming.controller;

import com.worldcupgamming.mapper.UserMapper;
import com.worldcupgamming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello.htm")
public class HelloController {

//    @Autowired
//    private UserService userService;

    @Autowired
    private UserMapper userMapper;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("username", "xingchi.wxc");
        model.addAttribute("users", userMapper.getAllUsers().size());
        return "hello";
	}

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
}