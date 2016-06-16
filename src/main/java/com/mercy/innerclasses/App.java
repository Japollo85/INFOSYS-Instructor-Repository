package com.mercy.innerclasses;

public class App {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass oi = oc.new InnerClass();
		oi.computeAverage(args);
		
		MethodLocalInner mli = new MethodLocalInner();
		mli.computeAverage(args);
		
		AnonymousInnerClass aii = new AnonymousInnerClass();
		aii.computeAverage();
	}
}
