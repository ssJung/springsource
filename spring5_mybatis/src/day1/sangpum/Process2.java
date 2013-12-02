package day1.sangpum;

public class Process2 implements ProcessInter2 {
	private DaoInter inter;
	public void setInter(DaoInter inter) {
		this.inter = inter;
	}
	@Override
	public void insert(SangpumDTO dto) {
		// TODO Auto-generated method stub
		inter.insertSangpum(dto);
		System.out.println("데이타 추가 성공");
		
	}

}
