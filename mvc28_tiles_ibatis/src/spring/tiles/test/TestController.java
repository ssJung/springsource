package spring.tiles.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("login.do")
	public ModelAndView test1()
	{
		ModelAndView view=new ModelAndView();
		view.setViewName("login.tiles");
		return view;
	}
	
	@RequestMapping("member.do")
	public ModelAndView test2()
	{
		ModelAndView view=new ModelAndView();
		view.setViewName("member.tiles");
		return view;
	}
}
