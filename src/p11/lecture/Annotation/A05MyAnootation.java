package p11.lecture.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ForType
public class A05MyAnootation {
	@ForField
	@ForFieldAndMethod
	int field;
	
	@ForFieldAndMethod
	public void method1() {
		
	}

}

@Target(ElementType.TYPE)
@interface ForType {}

@Target(ElementType.FIELD)
@interface ForField{}

@Target({ElementType.FIELD, ElementType.METHOD})
@interface ForFieldAndMethod{}