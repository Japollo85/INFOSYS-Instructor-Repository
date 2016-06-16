package com.training.java.arrays;

public class CalculateDistance {
	
	/**
	 * Returning the distance between two points
	 * <p>
	 * This method computes the distance between two points that should be integers{@link Integer}}
	 * @param startLocation the starting point to be provided by the user of this API
	 * @param endLocation the end point to be provided by the user of this API
	 * @return
	 */
	
	
	public Integer getDistance(String startLocation,String endLocation){
		 
		 int start = Integer.getInteger(startLocation);
		 int end = Integer.getInteger(endLocation);
		 Integer distance = end - start;		 
		 return distance; 
		 
	 }


}
