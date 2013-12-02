package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.MemberDto;
import com.spring.model.MemberProcessDao;

@Controller
public class SelectPartController {
	private MemberProcessDao processDao;
	
	public void setProcessDao(MemberProcessDao processDao) {
		this.processDao = processDao;
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView process(@RequestParam("id") String id)
	{
		MemberDto dto=processDao.getMember(id);
		return new ModelAndView("selectpart", "member",dto);
	}
	
}
