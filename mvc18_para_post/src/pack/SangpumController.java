package pack;

import model.SangpumModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SangpumController {
	@RequestMapping(value="sangpum.do",method=RequestMethod.POST)
	//public ModelAndView list(SangpumBean bean)
	public ModelAndView list(@ModelAttribute("my") SangpumBean bean)
	{
		ModelAndView view=new ModelAndView();
		//¸ðµ¨°ú Åë½Å
		String data=SangpumModel.getInstance().compute(bean);
		view.addObject("data", data);
		view.setViewName("result");
		return view;
	}
}
