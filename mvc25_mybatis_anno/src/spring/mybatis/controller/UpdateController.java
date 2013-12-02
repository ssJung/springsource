package spring.mybatis.controller;

import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mybatis.model.MemBean;
import spring.mybatis.model.MemDto;
import spring.mybatis.model.MemInter;

@Controller
public class UpdateController {
	private MemInter inter;
	public void setInter(MemInter inter) {
		this.inter = inter;
	}
	@RequestMapping(value="update.do",method=RequestMethod.GET)
	public ModelAndView update(@RequestParam("num") String num)
	{
		MemDto dto=inter.selectPart(num);
		return new ModelAndView("updateForm","dto",dto);
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public String update(MemBean bean)
	{
		if(inter.updateData(bean))
			return "redirect:/list.do";
		else
			return "redirect:/error.jsp";
			
	}
	
}



