package day1.spring.di;

import java.io.IOException;

import day1.test.OutFileInter;

public class MessageInterImpl implements MessageInter {
	private String name1,name2;
	private int year;
	private String spec;
	private OutFileInter inter;//��ü���Կ�
	
	public MessageInterImpl() {
		// TODO Auto-generated constructor stub
	}
	public MessageInterImpl(String name1,String name2,int year)
	{
		// TODO Auto-generated constructor stub
		this.name1=name1;
		this.name2=name2;
		this.year=year;
	}
	
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public String getSpec() {
		return spec;
	}
	public void setInter(OutFileInter inter) {
		this.inter = inter;
	}
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		String msg=name1+" "+name2+" "+year+"��";
		msg += "\r\n"+this.getSpec();
		
		System.out.println("�޼���:"+msg);
		
		try {
			inter.outFile(msg);
		} catch (IOException e) {
			System.out.println("����:"+e.getMessage());
			e.printStackTrace();
		}			

	}

}







