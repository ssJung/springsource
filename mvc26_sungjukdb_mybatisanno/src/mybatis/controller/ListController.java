package mybatis.controller;

import java.util.List;

import mybatis.model.SungjukInter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {
	private SungjukInter inter;
	public void setInter(SungjukInter inter) {
		this.inter = inter;
	}
	
	@RequestMapping("list.do")
	public ModelAndView list()
	{
		List list=inter.getDataAll();
		ModelAndView view=new ModelAndView();
		view.addObject("list", list);
		view.addObject("cnt",list.size());
		view.setViewName("sungjukList");
		return view;
	}
	
}
