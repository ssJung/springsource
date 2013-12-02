package com.spring.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.MemberDto;
import com.spring.model.MemberProcessDao;

@Controller
public class SelectListController {
	private MemberProcessDao memberProcessDao;
	private int pageSize=5;
	
	public void setMemberProcessDao(MemberProcessDao memberProcessDao) {
		this.memberProcessDao = memberProcessDao;
	}
	
	//list.do?pageNum=3
	//list.do
	@RequestMapping("/list.do")
	public ModelAndView process(@RequestParam(value="pageNum",defaultValue="1") String pageNum)
	{
		int currentPage=Integer.parseInt(pageNum);
		int startRow=(currentPage-1)*pageSize+1;
		int endRow=currentPage*pageSize;
		int count=memberProcessDao.getMemberCount();		
		
		ModelAndView view=new ModelAndView();
		view.setViewName("selectlist");
		List<MemberDto> list=null;
		if(count>0)
			list=memberProcessDao.getMemberList(startRow, endRow);
		else
			list=Collections.emptyList();
		view.addObject("list", list);
		view.addObject("currentPage", currentPage);
		view.addObject("count", count);
		view.addObject("pageSize", pageSize);
		
		return view;
	}
}
