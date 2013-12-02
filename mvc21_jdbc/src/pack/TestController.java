package pack;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	private ItemDao itemDao;
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	@RequestMapping("/test.do")
	public ModelAndView handle()
	{
		List list=itemDao.listAll();
		return new ModelAndView("result", "list", list);
	}
}
