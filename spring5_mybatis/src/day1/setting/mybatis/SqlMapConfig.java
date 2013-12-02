package day1.setting.mybatis;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class SqlMapConfig {
 //ibatis의 SqlMapClient와 같은 역할
 public static SqlSessionFactory sqlSession;
 
 static{
  String resource = "day1/setting/mybatis/Configuration.xml";
  
  try {
   Reader reader = Resources.getResourceAsReader(resource);
   sqlSession = new SqlSessionFactoryBuilder().build(reader);
   reader.close();
  } catch (Exception e) {
   System.out.println("SqlMapConfig 오류 : " + e);
  }
 }
 
 public static SqlSessionFactory getSqlSession(){
  return sqlSession;
 }
}
