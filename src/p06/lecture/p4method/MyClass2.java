package p06.lecture.p4method;

public class MyClass2 {
	int a;
	
	void method1(int b) {
		int c = 99;
		int a = 100000;
		System.out.println("a:" + a);
		System.out.println("this.a:" + this.a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		// a는 필드값(값이 없으면 초기값 0)을 가져와서 사용가능
		// b는 호출될때 설정된 값으로 사용가능
		// c는 초기값 설정없이 사용 불가
	}
}
