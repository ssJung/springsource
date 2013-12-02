package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dto.Article;
import spring.service.WriteArticleService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("aopContext.xml");
		WriteArticleService articleService=
				(WriteArticleService)context.getBean("serviceImpl");
		articleService.write(new Article());
	}

}
