package spring.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mybatis.model.MemBean;
import spring.mybatis.model.MemInter;

@Controller
public class InsertController {
	private MemInter inter;
	public void setInter(MemInter inter) {
		this.inter = inter;
	}
	@RequestMapping("insert.do")
	public String insert()
	{
		return "insertForm";
	}
	
	@RequestMapping(value="insert.do",method=RequestMethod.POST)
	public String insert(MemBean bean)
	{
		boolean b=inter.insertData(bean);
		if(b)
		{
			return "redirect:/list.do";
		}else
		{
			return "redirect:/error.jsp";
		}
	}
}













