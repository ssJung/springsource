package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	@RequestMapping("/list.do")
	public ModelAndView process()
	{
		System.out.println("process");
		String msg="아이디와 비번 맞아서 로그인 성공!!!";
		ModelAndView view=new ModelAndView();
		view.setViewName("result");
		view.addObject("data",msg);
		return view;
	}
}
