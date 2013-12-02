package spring.aop2;

public class HelloInterfaceImpl implements HelloInterface{
	public HelloInterfaceImpl() {
		System.out.println("HelloInterfaceImpl 생성자");
	}
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			System.out.println("** say 메소드 수행 **");
			System.out.println("2초간 수행!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
