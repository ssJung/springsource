package spring.ibatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.ibatis.model.MemBean;
import spring.ibatis.model.MemprocessDao;

@Controller
public class InsertController {
	private MemprocessDao dao;
	public void setDao(MemprocessDao dao) {
		this.dao = dao;
	}
	@RequestMapping("insert.do")
	public String insert()
	{
		return "insertForm";
	}
	
	@RequestMapping(value="insert.do",method=RequestMethod.POST)
	public String insert(MemBean bean)
	{
		boolean b=dao.insertData(bean);
		if(b)
		{
			return "redirect:/list.do";
		}else
		{
			return "redirect:/error.jsp";
		}
	}
}













