package p11.lecture.Annotation;

@MyAnnotation3
public class A04Annotation {
	
	@MyAnnotation3
	int field;
	
	@MyAnnotation3
	A04Annotation() {
	}
	
	@MyAnnotation3(999) // element의 값이 1개이고 value이면 value생략가능
	public void method1() {
		
		@MyAnnotation3
		int val;
		
	}
	
	@MyAnnotation3(value = 999)
	public void method2() {
		
	}
	
	@MyAnnotation3(value = 999, attr1 = 765)
	public void method3() {
		
	}

}
