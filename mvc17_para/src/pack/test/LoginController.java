package pack.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("login.do")
public class LoginController{
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	//@RequestMapping(method=RequestMethod.GET)
	//방법 1
	/*
	public ModelAndView login(HttpServletRequest request)
	{
		ModelAndView view=new ModelAndView();
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		String data="id:"+id+",pass:"+pwd+"<br>";
		if(id.equals("angel") && pwd.equals("1234"))
		{
			data+="로그인 성공 !!!";
		}else
		{
			data+="아이디나 패스워드 틀림!!";
		}
		view.addObject("data", data);
		view.setViewName("result");//forword
		//view.setViewName("redirect:/result.jsp");//데이타전달안됨
		return view;
	}
	*/
	
	//방법2
	public ModelAndView submit(@RequestParam("id") String id,
			@RequestParam("pwd") String pass,
			@RequestParam(value="gender",defaultValue="여자") String gender)
	{
		ModelAndView view=new ModelAndView();
		String data="id:"+id+",pass:"+pass+"<br>";
		if(id.equals("angel") && pass.equals("1234"))
		{
			data+="로그인 성공 !!!";
		}else
		{
			data+="아이디나 패스워드 틀림!!";
		}
		data += "<br>나의 성별 : "+gender;
		view.addObject("data", data);
		view.setViewName("result");//forword
		return view;
	}
	
}





