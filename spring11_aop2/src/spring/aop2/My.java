package spring.aop2;

//���θ޼ҵ� �յڷ� ������ �޼ҵ�
public class My {
	public static My getInstance()
	{
		return new My();
	}
	
	public void myLogOn()
	{
		System.out.println("target �޼ҵ� �������� �α��� �۾�");
	}
	
	public void myLogOut()
	{
		System.out.println("target �޼ҵ� �����Ŀ� �α׾ƿ� �۾�");
	}
}
