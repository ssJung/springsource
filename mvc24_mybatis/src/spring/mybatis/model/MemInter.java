package spring.mybatis.model;

import java.util.List;

public interface MemInter {
	public List getDataAll();
	public boolean insertData(MemBean bean);
	public MemDto selectPart(String num);
	public boolean updateData(MemBean bean);
	public boolean deleteData(String num);
}
