package spring.mybatis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mybatis.model.MemprocessDao;

@Controller
public class ListController {
	private MemprocessDao dao;
	
	public void setDao(MemprocessDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("list.do")
	public ModelAndView list()
	{
		List list=dao.getDataAll();
		return new ModelAndView("list","list",list);
	}
	
}
