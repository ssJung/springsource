package spring.mybatis.controller;

import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mybatis.model.MemBean;
import spring.mybatis.model.MemDto;
import spring.mybatis.model.MemprocessDao;

@Controller
public class UpdateController {
	private MemprocessDao dao;
	public void setDao(MemprocessDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="update.do",method=RequestMethod.GET)
	public ModelAndView update(@RequestParam("num") String num)
	{
		MemDto dto=dao.selectPart(num);
		return new ModelAndView("updateForm","dto",dto);
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public String update(MemBean bean)
	{
		if(dao.updateData(bean))
			return "redirect:/list.do";
		else
			return "redirect:/error.jsp";
			
	}
	
}



