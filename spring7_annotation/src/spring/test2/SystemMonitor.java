package spring.test2;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor {
	//setter�� �ʿ���� �ڵ����� ������ �ȴ�
	//�Ȱ��� �̸��� ���� ã�Ƽ� �ڵ� ����
	@Autowired
	private Sender sender;
	
//	public void setSender(Sender sender) {
//		this.sender = sender;
//	}
	
//	public void kbs(Sender sender) {
//		this.sender = sender;
//	}
	
	public Sender getSender() {
		return sender;
	}
}
