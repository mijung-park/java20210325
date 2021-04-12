package p07.lecture.p3method_override;

public class Child extends Parent {

	@Override // annotation
	public void method1() {
		// 재정의
		super.method1(); // 위치는 상관없음!
		System.out.println("method1 - child");
	}
}
