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
		return "���̴� "+nai+"���̰� �̸��� "+showName+
				"�̸� , ��̴� "+showName.toHobby()+"�Դϴ�";
	}
	
}
