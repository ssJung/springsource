package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class SangpumDao {
	DataSource ds;
	public SangpumDao() {
		// TODO Auto-generated constructor stub
		Context context;
		try {
			context = new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/ora");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<SangpumDto> getDataAll()
	{
		ArrayList<SangpumDto> list=new ArrayList<SangpumDto>();
		String sql="select * from sangpum order by code asc";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				SangpumDto dto=new SangpumDto();
				dto.setCode(rs.getString("code"));
				dto.setPum(rs.getString("pum"));
				dto.setSu(rs.getString("su"));
				dto.setDan(rs.getString("dan"));
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("select ¿À·ù:"+e.getMessage());
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}
}






