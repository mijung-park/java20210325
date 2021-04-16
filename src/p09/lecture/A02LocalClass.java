package p09.lecture;

public class A02LocalClass {
	// non-static inner class
	class InnerClass {
		
	}
	
	// static nested class
	static class NestedClass {
		
	}
	void method1() {
		// local class (메소드 안에서만 사용 가능)
		class LocalClass {
			// 필드
			// 생성자
			// 메소드
		}
		LocalClass o1 = new LocalClass();
	}

}
