package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private String formViewName="/loginForm";
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	//2.실행
	public String form(){
		System.out.println("form");
		return formViewName;
	}
	//1.실행
	@ModelAttribute("command") //command 는 디폴트.form에서 생략가능
	public LoginCommand formback()
	{
		System.out.println("formback");
		return new LoginCommand();
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String submit(@ModelAttribute("command") LoginCommand loginCommand)
	{
		System.out.println("submit");
		if(loginCommand.getUserid().equals("admin") &&
				loginCommand.getPasswd().equals("1234"))
		{
			return "redirect:/list.do";
		}else
		{
			return formViewName;
		}
	}
}








