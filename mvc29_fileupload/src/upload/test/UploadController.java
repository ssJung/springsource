package upload.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	@RequestMapping(value="upload.do",method=RequestMethod.POST)
	public ModelAndView execute(
			UploadDTO dto,@RequestParam("report") MultipartFile report,
			HttpServletRequest request
			)
	{
		ModelAndView view=new ModelAndView();
		String path=request.getSession().getServletContext().getRealPath("save");
		System.out.println(path);
		FileWriter writer=new FileWriter();
		writer.writeFile(report, path, report.getOriginalFilename());
		String msg="학번 : "+dto.getStudentNumber()+"<br>";
		msg += report.getOriginalFilename()+" 파일 저장 성공";
		
		view.addObject("msg",msg);
		view.setViewName("result");
		return view;
		
	}
}
