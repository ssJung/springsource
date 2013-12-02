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
		System.out.println(signatureStr+" ����");
		try {
			Object obj=joinPoint.proceed();//���θ޼ҵ� ����
			return obj;
		}finally{
			System.out.println(signatureStr+" ����");
		}
	}
}
