package spring.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		String []configs=new String[2];
		configs[0]="aopContext.xml";
		configs[1]="initContext.xml";
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext(configs);
		WriteInterface writeInter=
				(WriteInterface)context.getBean("writeImpl");
		HelloInterface helloInter=
				(HelloInterface)context.getBean("helloImpl");
		
		writeInter.write();
		helloInter.say();
	}

}
