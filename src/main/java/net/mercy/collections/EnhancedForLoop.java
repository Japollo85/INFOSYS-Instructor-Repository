package net.mercy.collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {
	
	 public static void main(String[] args) {
	      List<StringBuilder> lst = new ArrayList<StringBuilder>();
	      ;
	      List<String> strList = new ArrayList<String>();
	      strList.add("A");
	      strList.add("B");
	      lst.add(new StringBuilder("Tesla"));
	      lst.add(new StringBuilder("BMW"));
	      lst.add(new StringBuilder("Audi"));
	      System.out.println(lst); 
	 
	      for (StringBuilder sb : lst) {
	    	  
	    	  
	         sb.append("Mercedes");  
	      }
	      
	      for(String s:strList){
	    	  s+="Merc";
	      }
	      
	      System.out.println(strList);
	      System.out.println(lst); 
	   }

}
