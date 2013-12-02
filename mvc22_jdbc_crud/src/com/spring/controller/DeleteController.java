package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.MemberProcessDao;

@Controller
public class DeleteController {
	private MemberProcessDao processDao;

	public void setProcessDao(MemberProcessDao processDao) {
		this.processDao = processDao;
	}
	
	@RequestMapping("/delete.do")
	public ModelAndView process(@RequestParam("id") String id)
	{
		processDao.deleteData(id);
		return new ModelAndView("redirect:list.do");
	}
}
