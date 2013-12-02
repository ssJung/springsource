package spring.mybatis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mybatis.model.MemInter;

@Controller
public class ListController {
	private MemInter inter;
	public void setInter(MemInter inter) {
		this.inter = inter;
	}
	
	@RequestMapping("list.do")
	public ModelAndView list()
	{
		List list=inter.getDataAll();
		return new ModelAndView("list","list",list);
	}
	
}
