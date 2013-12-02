package day1.sangpum;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SangpumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("appContext.xml");
		ProcessInter inter=(ProcessInter)context.getBean("process");
		ProcessInter2 inter2=(ProcessInter2)context.getBean("process2");
		Scanner sc=new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("1.����Ÿ�߰�  2.��ü ���  3.����");
			num=Integer.parseInt(sc.nextLine());
			switch(num)
			{
			case 1:
				{
					System.out.print("��ǰ��:");
					String pum=sc.nextLine();
					System.out.print("����:");
					int su=Integer.parseInt(sc.nextLine());
					System.out.print("�ܰ�:");
					int dan=Integer.parseInt(sc.nextLine());
					
					SangpumDTO dto=new SangpumDTO();
					dto.setPum(pum);
					dto.setSu(su);
					dto.setDan(dan);
					inter2.insert(dto);
					break;
				}
			case 2:
				inter.display();
				break;
			default:
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		}
		
	}

}
