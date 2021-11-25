package com.spring.mvc22.dataTransfer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("vTOc")
public class ViewToController {

		
	@RequestMapping(value="/transfer1" , method=RequestMethod.POST)
	public String transfer1(HttpServletRequest request) {
		
		System.out.println("\n transfer1 \n");
		System.out.println("id : " + request.getParameter("id"));
		System.out.println("password : " + request.getParameter("password"));
		System.out.println("name : " + request.getParameter("name"));
		System.out.println("email : " + request.getParameter("email"));
		System.out.println();
		
		return "home";
	}
}
