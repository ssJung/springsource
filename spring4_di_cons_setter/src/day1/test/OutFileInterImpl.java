package day1.test;

import java.io.FileWriter;
import java.io.IOException;

public class OutFileInterImpl implements OutFileInter {
	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public void outFile(String msg) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter(filePath);
		writer.write(msg);
		writer.close();

	}

}
