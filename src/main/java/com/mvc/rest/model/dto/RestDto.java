package com.mvc.rest.model.dto;

public class RestDto {
	
	private int restno;
	private String restid;
	private String restpw;
	private String restname;
	
	public RestDto() {
		
		super();
	}
	
	public RestDto(int restno, String restid, String restpw, String restname) {
		super();
		this.setRestno(restno);
		this.setRestid(restid);
		this.setRestpw(restpw);
		this.setRestname(restname);
	}

	public int getRestno() {
		return restno;
	}

	public void setRestno(int restno) {
		this.restno = restno;
	}

	public String getRestid() {
		return restid;
	}

	public void setRestid(String restid) {
		this.restid = restid;
	}

	public String getRestpw() {
		return restpw;
	}

	public void setRestpw(String restpw) {
		this.restpw = restpw;
	}

	public String getRestname() {
		return restname;
	}

	public void setRestname(String restname) {
		this.restname = restname;
	}
	

}
