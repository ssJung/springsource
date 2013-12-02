package pack;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ListController {
	private SangpumDao dao;
	
	public void setDao(SangpumDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/list.do",method=RequestMethod.GET)
	public ModelAndView process()
	{
		ArrayList<SangpumDto> list=dao.getDataAll();
		return new ModelAndView("result", "list", list);
	}
}
