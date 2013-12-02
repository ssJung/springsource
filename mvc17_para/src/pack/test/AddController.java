package pack.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping(value="add.do",method=RequestMethod.GET)
	public ModelAndView hanbit(
			@RequestParam("su1") int su1,
			@RequestParam("su2") int su2
			)
	{
		ModelAndView view=new ModelAndView();
		int sum=su1+su2;
		String data=su1+" 더하기 "+su2+" 는 "+sum+"입니다";
		view.addObject("data",data);
		view.setViewName("result");
		return view;
	}
}
