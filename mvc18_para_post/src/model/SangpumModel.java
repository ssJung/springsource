package model;

import pack.SangpumBean;

public class SangpumModel {
	public static SangpumModel getInstance()
	{
		return new SangpumModel();
	}
	
	public String compute(SangpumBean bean)
	{
		String data="�ڵ�:"+bean.getCode()+"<br>"+
				"��ǰ:"+bean.getSang()+"<br>"+
				"�ܰ�:"+bean.getDan()+"<br>"+
				"����:"+bean.getSu()+"<br>"+
				"�ݾ�:"+bean.getSu()*bean.getDan();
		return data;
				
	}
}
