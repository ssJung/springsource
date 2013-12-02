package pack;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private SangpumSelect sangpumSelect;
	
	public void setSangpumSelect(SangpumSelect sangpumSelect) {
		this.sangpumSelect = sangpumSelect;
	}
	public SangpumSelect getSangpumSelect() {
		return sangpumSelect;
	}	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		Main main=context.getBean("main",Main.class);
		main.getSangpumSelect().show();
	}

}
