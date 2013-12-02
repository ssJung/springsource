package spring.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class ProfileAdvice {
	@Around("execution(public * spring..*(..))")
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
