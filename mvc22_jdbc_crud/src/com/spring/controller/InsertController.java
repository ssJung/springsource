package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.MemberDto;
import com.spring.model.MemberProcessDao;
//ȸ������ Ŭ����
//formBack->form

//��� ��ư Ŭ����
//formBack->submit

@Controller
public class InsertController {
	private String formViewname="/insertForm";
	private MemberProcessDao processDao;
	
	public void setProcessDao(MemberProcessDao processDao) {
		this.processDao = processDao;
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.GET)
	public String form()
	{
		return formViewname;
	}
	@ModelAttribute("command")
	public MemberDto formBack()
	{
		return new MemberDto();
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String submit(MemberDto dto)
	{
		processDao.insertData(dto);
		return "redirect:/list.do";
	}
}





