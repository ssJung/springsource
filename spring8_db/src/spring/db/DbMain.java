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
		
		System.out.println("**�ּҺ�**");
		//�̱��� Ÿ���̹Ƿ� �ѹ��� �����ȴ�. �ּҰ� ����
		//bean ����� scope="prototype" �� �ָ� �Ź� �����ȴ�
		System.out.println(processInter);
		System.out.println(processInter2);
		processInter.display();
		
		System.out.println("**����Ÿ �߰� 1 **");
		processInter.insert(new SangpumDTO("������", 3, 2300));
		processInter.display();
	}

}
