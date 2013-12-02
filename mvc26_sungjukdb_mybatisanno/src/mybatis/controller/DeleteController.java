package mybatis.controller;

import mybatis.model.SungjukInter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
	private SungjukInter inter;
	public void setInter(SungjukInter inter) {
		this.inter = inter;
	}
	
	@RequestMapping("/delete.do")
	public String delete(@RequestParam("num") String num)
	{
		inter.deleteSungjuk(num);
		return "redirect:/list.do";
	}
	
}
