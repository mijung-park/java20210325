package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1&&");
	}
	
	void method2(int i, int j) {
		System.out.println("method2##");
	}
	
	// varargs : argument의 갯수를 모를때! 배열로 인식!
	void method3(int... i) {
		System.out.println("method3@@");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	// 다른 para와 같이 쓸때는 항상 맨 뒤에 와야함!
	void method4(double d, int...i) {
		System.out.println("method4$$");
		System.out.println(d);
		System.out.println(Arrays.toString(i));
	}
}
