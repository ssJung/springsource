package day1.spring;

public class MyProcess {
	private int nai;
	private ShowName showName;
	
	public void setNai(int nai) {
		this.nai = nai;
	}
	public void setShowName(ShowName showName) {
		this.showName = showName;
	}
	
	@Override
	public String toString() {
		return "나이는 "+nai+"세이고 이름은 "+showName+
				"이며 , 취미는 "+showName.toHobby()+"입니다";
	}
	
}
