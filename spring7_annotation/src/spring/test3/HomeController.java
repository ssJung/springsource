package spring.test3;

import javax.annotation.Resource;

public class HomeController {
	@Resource(name="abc1")
	private Abc1 abc1;
	
	@Resource(name="abc2")
	private Abc2 abc2;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "°á°ú : "+abc1+","+abc2;
	}
}
