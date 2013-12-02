package day1.sangpum;

import java.sql.SQLException;
import java.util.List;

public interface DaoInter {
	List<SangpumDTO> getDataAll() throws SQLException ;
	void insertSangpum(SangpumDTO dto) throws SQLException;
}
