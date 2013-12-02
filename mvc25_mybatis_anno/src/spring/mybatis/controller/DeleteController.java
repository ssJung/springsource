package spring.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mybatis.model.MemInter;

@Controller
public class DeleteController {
	private MemInter inter;
	public void setInter(MemInter inter) {
		this.inter = inter;
	}
	
	@RequestMapping("/delete.do")
	public String delete(@RequestParam("num") String num)
	{
		if(!inter.deleteData(num))
			return "redirect:/error.jsp";
		else
			return "redirect:/list.do";
	}
	
}
