package com.spring.mvc22.dataTransfer.controller;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc22.dataTransfer.domain.MemberDto;

@Controller
@RequestMapping("vTOc")
public class ViewToController {
	
	
	// 예시 1) HttpServletRequset
		
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
	
	// 2) @ModelAttribute , 커맨드객체
	
	@RequestMapping(value="/transfer2", method=RequestMethod.POST)
	public String transfer2(MemberDto memberDto) {
		
		System.out.println("\n transfer2 \n");
		System.out.println(memberDto);
		
		return "home";
	}
	
	// 3) @RequestParam Map<K, V>
	
	@RequestMapping(value="/transfer3", method=RequestMethod.POST)
	public String transfer3(@RequestParam Map<String, Object> memberMap) {
		
		System.out.println("\n transfer3 \n");
		System.out.println(memberMap);
		System.out.println("id : " + memberMap.get("id"));
		System.out.println("password : " + memberMap.get("password"));
		System.out.println("name : " + memberMap.get("name"));
		System.out.println("email : " + memberMap.get("email"));
		System.out.println("addData1 : " + memberMap.get("addData1"));
		System.out.println("addData2 : " + memberMap.get("addData2"));
		System.out.println("addData3 : " + memberMap.get("addData3"));
		System.out.println();
		
		return "home";
	}
	
	
	// @RequestParam
	@RequestMapping(value="/transfer4", method=RequestMethod.POST)
	public String transfer4(String id, String password) {
		
		System.out.println("\n transfer4 \n");
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println();
		
		return "home";
	}
	
	// @PathVariable
	
	@RequestMapping(value="/transfer5/{isMember}/{isSession}", method=RequestMethod.GET)
	public String transfer5(@PathVariable String isMember, @PathVariable String isSession) {
		
		System.out.println("\n transfer5 \n");
		System.out.println("isMember : " + isMember);
		System.out.println("isSession : " + isSession);
		System.out.println();
		
		return "home";
	}
}
