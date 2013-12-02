package pack;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WorldActionController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView view=new ModelAndView();
		view.setViewName("view2");
		view.addObject("date", new Date());
		view.addObject("name","ȫ�浿");
		return view;
	}
}
