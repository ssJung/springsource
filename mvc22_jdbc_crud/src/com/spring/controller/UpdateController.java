package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.MemberDto;
import com.spring.model.MemberProcessDao;

@Controller
public class UpdateController {
	private String formViewName="/updateForm";
	
	private MemberProcessDao processDao;
	public void setProcessDao(MemberProcessDao processDao) {
		this.processDao = processDao;
	}
	
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public ModelAndView form(@RequestParam("id") String id)
	{
		MemberDto dto=processDao.getMember(id);
		return new ModelAndView(formViewName,"updateCommand",dto);
	}
	
	@ModelAttribute("updateCommand")
	public MemberDto formBack()
	{
		return new MemberDto();
	}
	
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public String submit(MemberDto dto)
	{
		processDao.updateData(dto);
		return "redirect:/list.do";
	}
}








