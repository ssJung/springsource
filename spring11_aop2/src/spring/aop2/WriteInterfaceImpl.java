package spring.aop2;

public class WriteInterfaceImpl implements WriteInterface {
	public WriteInterfaceImpl() {
		System.out.println("WriteInterfaceImpl 호출");
	}
	
	@Override
	public void write() {
		try {
			Thread.sleep(3000);
			System.out.println("** write 메소드 수행 **");
			System.out.println("3초간 수행!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
