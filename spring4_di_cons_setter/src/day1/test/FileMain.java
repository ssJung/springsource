package day1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day1.spring.di.MessageInter;

public class FileMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("initContext3.xml");
		MessageInter inter=(MessageInter)context.getBean("mbean");
		inter.sayHi();
	}

}
