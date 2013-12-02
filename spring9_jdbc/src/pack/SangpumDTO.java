package pack;

public class SangpumDTO {
	private String code;
	private String pum;
	private int su;
	private int dan;
	
	public SangpumDTO(){}
	
	public SangpumDTO(String pum, int su, int dan) {
		super();
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPum() {
		return pum;
	}
	public void setPum(String pum) {
		this.pum = pum;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
}
