package day1.spring;

public class WriteArticleServiceImpl implements WriteArticleService {

	private ArticleDao articleDao;
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		// TODO Auto-generated constructor stub
		this.articleDao=articleDao;
	}
	@Override
	public void write(Article article) {
		// TODO Auto-generated method stub
		System.out.println("WriteArticleService ÀÇ write ¼öÇà");
		articleDao.insert(article);
	}

}
