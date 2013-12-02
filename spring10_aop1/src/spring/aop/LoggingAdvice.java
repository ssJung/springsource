package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		//invoke:직접 대상객체의 메소드 호출 target의 sayHi 호출
		String methodName=invocation.getMethod().getName();
		System.out.println("호출된 메소드 이름:"+methodName);
		
		Object obj=invocation.proceed();//메소드호출..sayHi 호출
		System.out.println(methodName+" 수행후 다음작업 계속 진행");
		return obj;
	}
}
