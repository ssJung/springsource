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
		view.setViewName("/hanbit/login");
		return view;
	}
	
	@RequestMapping("member.do")
	public ModelAndView test2()
	{
		ModelAndView view=new ModelAndView();
		view.setViewName("/hanbit2/member");
		return view;
	}
}
