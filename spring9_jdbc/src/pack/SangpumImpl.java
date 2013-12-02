package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SangpumImpl extends JdbcDaoSupport implements SangpumInter{
	@Override
	public List getList() throws SQLException {
		
		RowMapper rowMapper=new SangpumRowMapper();
		String sql="select * from sangpum order by code asc";		
		return getJdbcTemplate().query(sql, rowMapper);
	}
	
	class SangpumRowMapper implements RowMapper
	{
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			SangpumDTO dto=new SangpumDTO();
			dto.setCode(rs.getString(1));
			dto.setPum(rs.getString(2));
			dto.setSu(rs.getInt(3));
			dto.setDan(rs.getInt(4));
			return dto;
		}
	}
}










