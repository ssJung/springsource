package spring.aop2;

public class WriteInterfaceImpl implements WriteInterface {
	public WriteInterfaceImpl() {
		System.out.println("WriteInterfaceImpl ȣ��");
	}
	
	@Override
	public void write() {
		try {
			Thread.sleep(3000);
			System.out.println("** write �޼ҵ� ���� **");
			System.out.println("3�ʰ� ����!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
