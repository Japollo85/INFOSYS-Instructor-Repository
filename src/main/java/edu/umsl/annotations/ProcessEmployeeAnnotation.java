package edu.umsl.annotations;

import java.lang.reflect.Method;

public class ProcessEmployeeAnnotation {
	
	public static void main(String[] args) {
		
		//created the class that has the annotation present
		Class<Employee> obj = Employee.class;
		
		//Checking to see if the annotation is present
		
		if(obj.isAnnotationPresent(EmployeeAnnotation.class)){
			
			
			//get the annotation
			EmployeeAnnotation empAnnotation =  obj.getAnnotation(EmployeeAnnotation.class);
			
			System.out.println(empAnnotation.name());
			System.out.println(empAnnotation.salary());
			System.out.println(empAnnotation.dob());
			
			for(Method method:obj.getDeclaredMethods()){
				if(method.isAnnotationPresent(EmployeeAnnotation.class)){
					
					//do something 
					
				}
			}
			
			
			
			
		}
		
	}
	

	


}
