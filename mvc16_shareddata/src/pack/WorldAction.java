package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WorldAction implements Controller{
	SharedData data;//공유자원
	public void setData(SharedData data) {
		this.data = data;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view=new ModelAndView();
		view.setViewName("helloworld");
		view.addObject("abc", "world 공유데이타:"+data.getShared());
		return view;
	}
}







