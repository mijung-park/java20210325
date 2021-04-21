package p11.lecture.Annotation;

import p05.textbook.s050701.Week;

public class A03Annotation {
	
	@MyAnnotation2(value = "java", attr1 = 3, 
			attr2 = {3, 4, 5}, attr3 = {"java", "spring"}, 
			attr4 = Week.WEDNEDAY )
	public void method1() {
		
	}
}
