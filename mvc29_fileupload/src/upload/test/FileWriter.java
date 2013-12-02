package upload.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileWriter {
	private FileOutputStream fos;
	
	public void writeFile(MultipartFile file,
			String path,String fileName)
	{
		try {
			byte fileData[]=file.getBytes();
			fos=new FileOutputStream(path+"\\"+fileName);
			fos.write(fileData);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
