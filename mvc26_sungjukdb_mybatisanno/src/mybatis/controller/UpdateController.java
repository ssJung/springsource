package mybatis.controller;

import java.lang.reflect.Member;

import mybatis.model.SungjukDTO;
import mybatis.model.SungjukInter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateController {
	private SungjukInter inter;
	public void setInter(SungjukInter inter) {
		this.inter = inter;
	}
	@RequestMapping(value="update.do",method=RequestMethod.GET)
	public ModelAndView update(@RequestParam("num") String num)
	{
		SungjukDTO dto=inter.getData(num);
		return new ModelAndView("updateForm","dto",dto);
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public String update(SungjukDTO dto)
	{
		inter.updateSungjuk(dto);
		return "redirect:/list.do";				
	}
	
}



