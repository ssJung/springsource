package spring.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	public Object logging(ProceedingJoinPoint joinPoint)
	 	throws Throwable	 	
	{
		My.getInstance().myLogOn();
		Object obj=null;
		obj=joinPoint.proceed();//������target���������
		My.getInstance().myLogOut();
		return obj;
	}
	//say �� ȣ��ɶ��� �����ϴ°ŷ�...
	public Object logging2(ProceedingJoinPoint joinPoint)
		 	throws Throwable	 	
		{
		System.out.println("========logging2 ó��===============");
			StopWatch stopWatch=new StopWatch();//����ð�üũ
			stopWatch.start();
			My.getInstance().myLogOn();
			Object obj=null;
			obj=joinPoint.proceed();//������target���������
			My.getInstance().myLogOut();
			stopWatch.stop();
			System.out.println(joinPoint.getSignature().getName()
					+" �޼ҵ� ���� �ð�:"+
					stopWatch.getTotalTimeMillis());
			
			return obj;
		}
}
