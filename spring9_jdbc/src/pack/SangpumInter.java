package pack;

import java.sql.SQLException;
import java.util.List;

public interface SangpumInter {
	List<SangpumDTO> getList() throws SQLException;
}
