package spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.test2.SystemMonitor;
import spring.test3.HomeController;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=
			new ClassPathXmlApplicationContext("appContext4.xml");
		//Apple apple=(Apple)context.getBean("apple");
//		Apple apple=context.getBean("apple",Apple.class);
//		System.out.println(apple);
		
//		SystemMonitor monitor=context.getBean("monitor",SystemMonitor.class);
//		monitor.getSender().show();
		
		HomeController home=context.getBean("home",HomeController.class);
		System.out.println(home);
	}

}
