package spring.test;

import org.springframework.beans.factory.annotation.Required;

public class Apple {
	private int number;
	//필수 프로퍼티 설정, xml에서 반드시 property 설정해야함
	@Required  
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "number="+number;
	}
}
