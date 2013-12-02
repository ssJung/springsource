package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		//invoke:���� ���ü�� �޼ҵ� ȣ�� target�� sayHi ȣ��
		String methodName=invocation.getMethod().getName();
		System.out.println("ȣ��� �޼ҵ� �̸�:"+methodName);
		
		Object obj=invocation.proceed();//�޼ҵ�ȣ��..sayHi ȣ��
		System.out.println(methodName+" ������ �����۾� ��� ����");
		return obj;
	}
}
