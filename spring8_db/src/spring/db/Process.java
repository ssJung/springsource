package spring.db;

public class Process implements ProcessInter{
	private DaoInter daoInter;
	public Process(DaoInter inter) {
		// TODO Auto-generated constructor stub
		daoInter=inter;
	}
	@Override
	public void display() {
		daoInter.getList();
	}
	
	@Override
	public void insert(SangpumDTO dto) {
		// TODO Auto-generated method stub
		daoInter.insert(dto);
	}
}





