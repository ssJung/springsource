package spring.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		Process processInter=(Process)context.getBean("process");
		Process processInter2=(Process)context.getBean("process");
		
		System.out.println("**주소비교**");
		//싱글톤 타입이므로 한번만 생성된다. 주소가 같다
		//bean 선언시 scope="prototype" 를 주면 매번 생성된다
		System.out.println(processInter);
		System.out.println(processInter2);
		processInter.display();
		
		System.out.println("**데이타 추가 1 **");
		processInter.insert(new SangpumDTO("오렌지", 3, 2300));
		processInter.display();
	}

}
