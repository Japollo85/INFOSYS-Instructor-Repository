package net.mercy.objcomparison;



public class OverrideToString {
	
	private String fname;
	private String lname;
	
	/**
	 * Overriding toString() to return a concatenated name
	 * @return returning a String
	 */
	
	@Override
	public String toString() {
		return this.fname+this.lname;
	}


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
	
	

}
