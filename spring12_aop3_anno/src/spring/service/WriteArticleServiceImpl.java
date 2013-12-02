package spring.service;

import spring.dao.ArticleDao;
import spring.dto.Article;

public class WriteArticleServiceImpl implements WriteArticleService {

	private ArticleDao articleDao;
	
	public WriteArticleServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		// TODO Auto-generated constructor stub
		this.articleDao=articleDao;
	}
	@Override
	public void write(Article article) {
		// TODO Auto-generated method stub
		System.out.println("WriteArticleServiceImpl write 메소드 실행");
	}

}
