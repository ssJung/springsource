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
		inter.sayHello("�̽±�");
		
		inter=new Message2();
		inter.sayHello("������");*/
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		MessageInter inter=(MessageInter)context.getBean("mesBean1");
		inter.sayHello("��ȣ��");
		inter=(MessageInter)context.getBean("mesBean2");
		inter.sayHello("���缮");
	}

}






