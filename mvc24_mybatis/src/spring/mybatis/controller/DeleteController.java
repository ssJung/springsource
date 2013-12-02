package spring.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mybatis.model.MemprocessDao;

@Controller
public class DeleteController {
	private MemprocessDao dao;
	
	public void setDao(MemprocessDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/delete.do")
	public String delete(@RequestParam("num") String num)
	{
		if(!dao.deleteData(num))
			return "redirect:/error.jsp";
		else
			return "redirect:/list.do";
	}
	
}
