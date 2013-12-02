package pack;

import java.sql.SQLException;
import java.util.Iterator;

public class SangpumSelect {
	private SangpumInter sangpumInter;
	
	public void setSangpumInter(SangpumInter sangpumInter) {
		this.sangpumInter = sangpumInter;
	}
	
	public void show() throws SQLException
	{
		for(Iterator iter=sangpumInter.getList().iterator();
				iter.hasNext();)
		{
			SangpumDTO dto=(SangpumDTO)iter.next();
			System.out.println(dto.getCode()+"\t"+
					dto.getPum()+"\t"+dto.getSu()+"\t"+
					dto.getDan());
		}
	}
}





