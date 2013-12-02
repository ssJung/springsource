package spring.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	public Object logging(ProceedingJoinPoint joinPoint)
	 	throws Throwable	 	
	{
		My.getInstance().myLogOn();
		Object obj=null;
		obj=joinPoint.proceed();//지정된target모듈을수행
		My.getInstance().myLogOut();
		return obj;
	}
	//say 가 호출될때만 수행하는거로...
	public Object logging2(ProceedingJoinPoint joinPoint)
		 	throws Throwable	 	
		{
		System.out.println("========logging2 처리===============");
			StopWatch stopWatch=new StopWatch();//수행시간체크
			stopWatch.start();
			My.getInstance().myLogOn();
			Object obj=null;
			obj=joinPoint.proceed();//지정된target모듈을수행
			My.getInstance().myLogOut();
			stopWatch.stop();
			System.out.println(joinPoint.getSignature().getName()
					+" 메소드 실행 시간:"+
					stopWatch.getTotalTimeMillis());
			
			return obj;
		}
}
