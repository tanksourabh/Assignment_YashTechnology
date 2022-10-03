package com.yash.oops.program1;

/**
 * 
 * @author sourabh.tank
 *
 */
public class Person {
	private String pid;
	private String pname;
	private String paddress;
	private String dob;
	
	public Person(String pid, String pname, String paddress, String dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [Pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + "]";
	}
	
	
}