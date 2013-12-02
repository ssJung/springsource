package spring.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.annotations.Results;

public class SangpumDao implements DaoInter{
	public SangpumDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getList() {
		// TODO Auto-generated method stub
		System.out.println("** 상품 자료 읽기 **");
		
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.65:1521:orcl",
							"stu01","a1234");
			PreparedStatement pstmt=conn.prepareStatement(
					"select * from sangpum");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("code")+"\t"+
						rs.getString("pum")+"\t"+
						rs.getInt("su")+"\t"+
						rs.getInt("dan"));
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("getList오류:"+e.getMessage());
		}
	}
	
	@Override
	public void insert(SangpumDTO dto) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.65:1521:orcl",
					"stu01","a1234");
			PreparedStatement pstmt=conn.prepareStatement(
			"insert into sangpum values (seq1.nextval,?,?,?)");
			pstmt.setString(1, dto.getPum());
			pstmt.setInt(2, dto.getSu());
			pstmt.setInt(3, dto.getDan());
			//실행
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("insert오류:"+e.getMessage());
		}
	}

}











