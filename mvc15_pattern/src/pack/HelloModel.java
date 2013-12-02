package pack;

public class HelloModel {
	public static HelloModel getInstance()
	{
		return new HelloModel();
	}
	
	public String process()
	{
		return "좋은 하루 되세요";
	}
}
