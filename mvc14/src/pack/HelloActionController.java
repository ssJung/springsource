package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloActionController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view=new ModelAndView();//ΩÃ±€≈Ê≈∏¿‘
		view.setViewName("view1");
		view.addObject("message", "Merry Christmas!!!");
		return view;
	}
}
