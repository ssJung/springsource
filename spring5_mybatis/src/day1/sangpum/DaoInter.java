package day1.sangpum;

import java.util.List;

public interface DaoInter {
	List<SangpumDTO> getDataAll();
	void insertSangpum(SangpumDTO dto);
}
