package model;

import pack.SangpumBean;

public class SangpumModel {
	public static SangpumModel getInstance()
	{
		return new SangpumModel();
	}
	
	public String compute(SangpumBean bean)
	{
		String data="코드:"+bean.getCode()+"<br>"+
				"상품:"+bean.getSang()+"<br>"+
				"단가:"+bean.getDan()+"<br>"+
				"수량:"+bean.getSu()+"<br>"+
				"금액:"+bean.getSu()*bean.getDan();
		return data;
				
	}
}
