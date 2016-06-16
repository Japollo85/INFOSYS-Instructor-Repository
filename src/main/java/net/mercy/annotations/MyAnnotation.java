package net.mercy.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	String name();
	String hiredDate();
	int salary();
	public boolean enabled() default true;
}
