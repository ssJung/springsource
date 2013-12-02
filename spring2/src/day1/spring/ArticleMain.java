package day1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context=
//				new ClassPathXmlApplicationContext("appContext.xml");
		//classpath: �� �����Ȱ���
		ApplicationContext context=
				new ClassPathXmlApplicationContext("classpath:appContext.xml");
		WriteArticleService service=
				(WriteArticleService)context.getBean("writeArticle");
		service.write(new Article());
	}

}
