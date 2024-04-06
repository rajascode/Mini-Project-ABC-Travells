package com;

import java.util.HashMap;

public class UserDetails {
	
	
	private String fname;
	private String lname;
	private String mnumber;
	private String emailid;
	private String gender;
	private String password;
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	



	@Override
	public String toString() {
		return "UserDetails [fname=" + fname + ", lname=" + lname + ", mnumber=" + mnumber + ", emailid=" + emailid
				+ ", gender=" + gender + ", password=" + password + "]";
	}
	public UserDetails(String fname, String lname, String mnumber, String emailid, String gender, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mnumber = mnumber;
		this.emailid = emailid;
		this.gender = gender;
		this.password = password;
		
		
		HashMap<Integer , String> map = new HashMap<>();
		{
			
			
			map.put(1, fname);
			map.put(2, lname);
			map.put(3, mnumber);
			map.put(4, emailid);
			map.put(5, gender);
			map.put(6, password);
			
		
			System.out.println(map);
			
			
			
			
			
			
		}
	}
	
}
