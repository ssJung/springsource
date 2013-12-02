package spring.test;

import org.springframework.beans.factory.annotation.Required;

public class Apple {
	private int number;
	//�ʼ� ������Ƽ ����, xml���� �ݵ�� property �����ؾ���
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
