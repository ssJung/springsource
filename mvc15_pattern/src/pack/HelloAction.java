package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloAction extends AbstractController{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view=new ModelAndView();
		//¸ðµ¨°ú Åë½Å
		HelloModel model=HelloModel.getInstance();
		String result=model.process();
		
		view.setViewName("helloworld");
		view.addObject("abc", "HelloAction:"+result);
		return view;
	}
}
