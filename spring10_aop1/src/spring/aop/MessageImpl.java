package spring.aop;

//�ٽɷ���-target :�����Ͻ����� ����
public class MessageImpl implements MessageInter{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("�ȳ� "+name+"��!! �����Ͻ����� ������...");
	}
}
