package mybatis.controller;

import mybatis.model.SungjukDTO;
import mybatis.model.SungjukInter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
	private SungjukInter inter;
	public void setInter(SungjukInter inter) {
		this.inter = inter;
	}
	@RequestMapping("insert.do")
	public String insert()
	{
		return "insertForm";
	}
	
	@RequestMapping(value="insert.do",method=RequestMethod.POST)
	public String insert(SungjukDTO dto)
	{
		inter.insertSungjuk(dto);
		return "redirect:/list.do";
	}
}













