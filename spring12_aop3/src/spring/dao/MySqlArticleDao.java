package spring.dao;

import spring.dto.Article;

public class MySqlArticleDao implements ArticleDao{
	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("**DB레코드 추가작업 완료**");
	}
}
