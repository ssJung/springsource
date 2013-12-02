package spring.test2;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor {
	//setter가 필요없이 자동으로 주입이 된다
	//똑같은 이름의 빈을 찾아서 자동 주입
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
