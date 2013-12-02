package spring.ibatis.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class MemprocessDao extends SqlMapClientDaoSupport{
	public List getDataAll()
	{
		List list=(List)getSqlMapClientTemplate().queryForList("selectAllData");
		return list;
	}
	
	public boolean insertData(MemBean bean)
	{
		try{
			getSqlMapClientTemplate().insert("insertData",bean);
			return true;
		}catch(Exception e)
		{
			System.out.println("¿À·ù:"+e.getMessage());
			return false;
		}
		
	}
	
	public MemDto selectPart(String num)
	{
		MemDto dto=(MemDto)getSqlMapClientTemplate().queryForObject("selectPart",num);
		return dto;
	}
	public boolean updateData(MemBean bean)
	{
		int n=getSqlMapClientTemplate().update("updateData",bean);
		if(n>0)
			return true;
		else
			return false;
	}
	
	public boolean deleteData(String num)
	{
		int n=getSqlMapClientTemplate().delete("deleteData", num);
		if(n>0)
			return true;
		else
			return false;
	}
	
	
}









