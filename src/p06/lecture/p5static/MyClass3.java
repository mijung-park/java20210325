package p06.lecture.p5static;

public class MyClass3 {
	
	int i;
	static int j;

	static void method1() {
		System.out.println("method1");
		method3();
//		this.method3(); this 키워드로 호출불가! instance멤버만 사용가능
		System.out.println(j);
//		System.out.println(i);
	}
	
	static void method3() {
		System.out.println("method3");
//		method2(); static멤버에서 instance멤버에 접근 불가능
	}
	
	void method2() {
		System.out.println("method2");
		this.method4();
		
		// instance멤버는 static멤버에 접근가능
		method3();
	}
	
	void method4() {
		System.out.println("method4");
	}
}
