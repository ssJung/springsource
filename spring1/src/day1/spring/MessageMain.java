package day1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		MessageInter inter=null;
		inter=new Message1();
		inter.sayHello("ÀÌ½Â±â");
		
		inter=new Message2();
		inter.sayHello("±èÅÂÈñ");*/
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		MessageInter inter=(MessageInter)context.getBean("mesBean1");
		inter.sayHello("°­È£µ¿");
		inter=(MessageInter)context.getBean("mesBean2");
		inter.sayHello("À¯Àç¼®");
	}

}






