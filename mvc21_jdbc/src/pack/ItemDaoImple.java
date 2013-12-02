package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ItemDaoImple extends JdbcDaoSupport implements ItemDao{
	@Override
	public List listAll() {
		// TODO Auto-generated method stub
		String sql="select * from sangpum";
		
		return getJdbcTemplate().query(sql,new ItemRowMapper());
	}
	//내부클래스
	private class ItemRowMapper implements RowMapper
	{
		@Override
		public Object mapRow(ResultSet rs, int rowNum)
				throws SQLException {
			// TODO Auto-generated method stub
			SangpumDto dto=new SangpumDto();
			dto.setCode(rs.getString("code"));
			dto.setPum(rs.getString("pum"));
			dto.setSu(rs.getString("su"));
			dto.setDan(rs.getString("dan"));
			return dto;
		}
	}
}
