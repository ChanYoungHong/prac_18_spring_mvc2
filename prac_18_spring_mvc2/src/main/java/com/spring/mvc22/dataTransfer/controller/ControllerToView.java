package com.spring.mvc22.dataTransfer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc22.dataTransfer.domain.MemberDto;

@Controller
@RequestMapping("cTOv")
public class ControllerToView {
	
	// 1) Model
	
	@RequestMapping(value="/modelEx" , method=RequestMethod.GET)
	public String modelEx(Model model) {
		
		MemberDto memberDto;
		List<MemberDto> memberList = new ArrayList<MemberDto>();
		
		for(int i = 1; i < 11; i++) {
			memberDto = new MemberDto();
			memberDto.setId("아이디디디" + i);
			memberDto.setPassword("12341234");
			memberDto.setName("이름름름" + i);
			memberDto.setEmail("이메일" + i);
			
			memberList.add(memberDto);
		}
		
		model.addAttribute("method", "Model");
		model.addAttribute("memberList", memberList);
		
		return "dataTransfer/memberList";
		
	}
}
