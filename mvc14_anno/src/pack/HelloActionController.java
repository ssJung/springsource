package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloActionController{
	//@RequestMapping("hello.do")
	@RequestMapping(value="hello.do",method=RequestMethod.GET)
	
	public ModelAndView my() throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view=new ModelAndView();//ΩÃ±€≈Ê≈∏¿‘
		view.setViewName("view1");
		view.addObject("message", "Merry Christmas!!!");
		return view;
	}
}
