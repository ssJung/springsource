package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		MessageInter inter=(MessageInter)context.getBean("proxy");
		inter.sayHi();

	}

}
