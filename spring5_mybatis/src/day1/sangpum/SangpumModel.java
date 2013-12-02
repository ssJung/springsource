package day1.sangpum;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day1.setting.mybatis.SqlMapConfig;

public class SangpumModel implements DaoInter {
	private SqlSessionFactory factory=SqlMapConfig.getSqlSession();
	
	@Override
	public List<SangpumDTO> getDataAll() {
		// TODO Auto-generated method stub
		SqlSession session=factory.openSession();
		List<SangpumDTO> list=null;
		try {
			list=session.selectList("selectAllDatas");
			
		} catch (Exception e) {
			System.out.println("getDataAll 오류:"+e.getMessage());
		}finally{
			session.close();
		}
		
		return list;
	}
	
	@Override
	public void insertSangpum(SangpumDTO dto)
	{
		SqlSession session=factory.openSession();
		try {
			session.insert("insertSangpum", dto);
			session.commit();//또는 openSession(true)로 쎄션을 가져온다
		} catch (Exception e) {
			System.out.println("insert 오류:"+e.getMessage());
		}finally{
			session.close();
		}
	}

}




