package com.moje.webflow;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestController {

	private String testz="sprawdzam string ";
	
	
	
	public String getTestz() {
		return testz;
	}



	public void setTestz(String testz) {
		this.testz = testz;
	}



	public String test(){
		
		return "testzx";
	}
}
