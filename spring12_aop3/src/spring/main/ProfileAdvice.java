package spring.main;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfileAdvice {
	public Object trace(ProceedingJoinPoint joinPoint)
			throws Throwable
	{
		String signatureStr=joinPoint.getSignature().toShortString();
		System.out.println(signatureStr+" 시작");
		try {
			Object obj=joinPoint.proceed();//메인메소드 수행
			return obj;
		}finally{
			System.out.println(signatureStr+" 종료");
		}
	}
}
