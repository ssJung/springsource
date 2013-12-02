package day1.sangpum;

import java.sql.SQLException;
import java.util.ArrayList;

public class Process implements ProcessInter {
	private DaoInter inter;
	public Process(DaoInter inter) {
		// TODO Auto-generated constructor stub
		this.inter=inter;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		ArrayList<SangpumDTO>list=null;
		
		try {
			list=(ArrayList<SangpumDTO>)inter.getDataAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[오라클 상품 테이블 데이타 출력하기]");
		for(SangpumDTO dto:list)
		{
			System.out.printf("%10s%10s%6d%6d%7d\n",
					dto.getCode(),dto.getPum(),dto.getSu(),
					dto.getDan(),dto.getSu()*dto.getDan());
		}
	}
	
	@Override
	public void insertSangpum(SangpumDTO dto) {
		// TODO Auto-generated method stub
		try {
			inter.insertSangpum(dto);
		} catch (SQLException e) {
			System.out.println("insert오류:"+e.getMessage());
			e.printStackTrace();
		}
	}

}
