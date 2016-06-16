package net.mercy.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ProcessingAnnotation {

	public static void main(String[] args) {
		Class<MyClass> obj = MyClass.class;

		if (obj.isAnnotationPresent(MyAnnotation.class)) {

			Annotation annotation = obj.getAnnotation(MyAnnotation.class);
			MyAnnotation myannotation = (MyAnnotation) annotation;

			System.out.println(myannotation.name());
			System.out.println(myannotation.salary());
			System.out.println(myannotation.hiredDate());

			for (Method method : obj.getDeclaredMethods()) {
				if (method.isAnnotationPresent(MyAnnotation.class)) {
					Annotation annotateMethods = method.getAnnotation(MyAnnotation.class);
					MyAnnotation myann = (MyAnnotation) annotateMethods;
					if (myann.enabled()) {

						// do something

					}
				}

			}

		}
	}

}
