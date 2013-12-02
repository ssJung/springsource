package spring.main;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfileAdvice {
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
