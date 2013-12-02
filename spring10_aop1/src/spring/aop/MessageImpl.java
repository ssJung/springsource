package spring.aop;

//핵심로직-target :비지니스로직 수행
public class MessageImpl implements MessageInter{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("안녕 "+name+"님!! 비지니스로직 수행중...");
	}
}
