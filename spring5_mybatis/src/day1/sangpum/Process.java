package day1.sangpum;

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
		ArrayList<SangpumDTO>list=
				(ArrayList<SangpumDTO>)inter.getDataAll();
		System.out.println("[����Ŭ ��ǰ ���̺� ����Ÿ ����ϱ�]");
		for(SangpumDTO dto:list)
		{
			System.out.printf("%10s%10s%6d%6d%7d\n",
					dto.getCode(),dto.getPum(),dto.getSu(),
					dto.getDan(),dto.getSu()*dto.getDan());
		}

	}

}
