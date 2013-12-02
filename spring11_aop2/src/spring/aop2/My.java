package spring.aop2;

//메인메소드 앞뒤로 수행할 메소드
public class My {
	public static My getInstance()
	{
		return new My();
	}
	
	public void myLogOn()
	{
		System.out.println("target 메소드 수행전에 로그인 작업");
	}
	
	public void myLogOut()
	{
		System.out.println("target 메소드 수행후에 로그아웃 작업");
	}
}
