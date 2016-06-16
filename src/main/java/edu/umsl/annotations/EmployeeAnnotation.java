package edu.umsl.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeAnnotation {
	String name() default "John Doe";
	int salary();
	String dob();
}
