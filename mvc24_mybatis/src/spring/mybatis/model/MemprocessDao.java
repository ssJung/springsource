package spring.mybatis.model;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class MemprocessDao extends SqlSessionDaoSupport implements MemInter{
	public List getDataAll()
	{
		List list=getSqlSession().selectList("selectAllData");
		return list;
	}
	
	public boolean insertData(MemBean bean)
	{
		try{
			getSqlSession().insert("insertData",bean);
			return true;
		}catch(Exception e)
		{
			System.out.println("¿À·ù:"+e.getMessage());
			return false;
		}
		
	}
	
	public MemDto selectPart(String num)
	{
		MemDto dto=(MemDto)getSqlSession().selectOne("selectPart",num);
		return dto;
	}
	public boolean updateData(MemBean bean)
	{
		int n=getSqlSession().update("updateData",bean);
		if(n>0)
			return true;
		else
			return false;
	}
	
	public boolean deleteData(String num)
	{
		int n=getSqlSession().delete("deleteData", num);
		if(n>0)
			return true;
		else
			return false;
	}
	
	
}









