package spring.mybatis.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MemInter {
	@Select("select * from mem order by num asc")
	public List <MemDto> getDataAll();
	
	@Insert("insert into mem values (seq_db.nextval,#{name},#{addr},#{blood})")
	public boolean insertData(MemBean bean);
	
	@Select("select * from mem where num=#{num}")
	public MemDto selectPart(String num);
	
	@Update("update mem set name=#{name},addr=#{addr},blood=#{blood} where num=#{num}")
	public boolean updateData(MemBean bean);
	
	@Delete("delete from mem where num=#{num}")
	public boolean deleteData(String num);
}
