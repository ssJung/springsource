package mybatis.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SungjukInter {
	@Select("select * from sungjuk order by num asc")
	public List <SungjukDTO> getDataAll();
	
	@Insert("insert into sungjuk values (seq_db.nextval,#{name},#{java},#{jsp},#{spring})")
	public void insertSungjuk(SungjukDTO dto);
	
	@Select("select * from sungjuk where num=#{num}")
	public SungjukDTO getData(String num);
	
	@Update("update sungjuk set name=#{name},java=#{java},jsp=#{jsp},spring=#{spring} where num=#{num}")
	public void updateSungjuk(SungjukDTO dto);
	
	@Delete("delete from sungjuk where num=#{num}")
	public void deleteSungjuk(String num);
}
