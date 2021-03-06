package p08.lecture.ex2;

public interface MyInterface {
	// public static final 필드
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2;
//	(위 두개는 같은거! 2는 1의 public static final이 생략된 것!)
	String MY_FIELD3 = "hello";
	
	
	// public static 메소드  (클래스 메소드)
	public static void staticMethod1() {
		System.out.println("static method1");
	}
	
	static void staticMethod2() {
		System.out.println("static method2");
	}
	
	
	// ☆public abstract 메소드(인스턴스 메소드)☆
	public abstract void method1();
	void method2();
	
	
	// public default 메소드 (인스턴스 메소드)
	public default void defaultMethod1() {
		System.out.println("default method1");
	}
	
	default void defaultMethod2() {
		System.out.println("default method2");
	}
}
