package com.techm.beans;

public class Job {

	private int jcode;
	private String skill;
	private int yoe;
	private String location;
	private String sname;
	private String smail;
	
	
	public Job() {
		super();
	}


	public Job(int jcode, String skill, int yoe, String location, String sname,
			String smail) {
		super();
		this.jcode = jcode;
		this.skill = skill;
		this.yoe = yoe;
		this.location = location;
		this.sname = sname;
		this.smail = smail;
	}


	public int getJcode() {
		return jcode;
	}


	public void setJcode(int jcode) {
		this.jcode = jcode;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public int getYoe() {
		return yoe;
	}


	public void setYoe(int yoe) {
		this.yoe = yoe;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSmail() {
		return smail;
	}


	public void setSmail(String smail) {
		this.smail = smail;
	}
	
	
}