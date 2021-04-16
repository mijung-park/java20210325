package p09.lecture;

public class A01NestedClassExample {
	public static void main(String[] args) {
		A01NestedClass.StaticClass o1 = new A01NestedClass.StaticClass();
		
//		A01NestedClass.InnerClass o2 = new A01NestedClass.InnerClass();
		// NON static 클래스는 바로 접근이 불가.
		
		A01NestedClass outer1 = new A01NestedClass();
		A01NestedClass.InnerClass o2 = outer1.new InnerClass();
	}
}
