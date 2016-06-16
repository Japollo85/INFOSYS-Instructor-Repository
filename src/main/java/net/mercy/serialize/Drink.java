package net.mercy.serialize;

import java.io.Serializable;

public class Drink implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int temp;
	private transient boolean containsAlcholol; //not serialzied
	
	Drink(String name, int temp, boolean containsAlcohol){
		this.name = name;
		this.temp = temp;
		this.containsAlcholol = containsAlcohol;
	}
	
	public String toString(){
		return "Drink: name=" +name+ " temp="+temp+ " alcohol="+containsAlcholol;
	}
	
}
