package pack;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanbit/world.do")
public class WorldActionController{
	@RequestMapping(method=RequestMethod.GET)
	public String hi() throws Exception {
//		ModelAndView view=new ModelAndView();
//		view.setViewName("view2");
//		view.addObject("date", new Date());
//		view.addObject("name","ȫ�浿");
		return "view3";
	}
}
