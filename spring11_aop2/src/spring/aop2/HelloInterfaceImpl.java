package spring.aop2;

public class HelloInterfaceImpl implements HelloInterface{
	public HelloInterfaceImpl() {
		System.out.println("HelloInterfaceImpl ������");
	}
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			System.out.println("** say �޼ҵ� ���� **");
			System.out.println("2�ʰ� ����!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
