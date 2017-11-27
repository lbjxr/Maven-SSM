package com.ahpu.controller;

import com.ahpu.model.Users;
import com.ahpu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by x on 2017/11/27.
 */

@Controller
@RequestMapping("/show")
public class ShowUser {

    @Resource
    private UserService findUser;

    @RequestMapping("/user")
    public ModelAndView showUser(HttpServletRequest request){

        Map<String,Object> data = new HashMap<String,Object>();
        int userId = Integer.parseInt(request.getParameter("id"));

        Users user = findUser.selectByPrimaryKey(userId);
        data.put("userinfo",user);
        return new ModelAndView("showusers",data);
    }
}
