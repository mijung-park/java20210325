package p06.lecture.p7package;

import p06.lecture.p7package.package2.MyClass2;

public class A02Packcage {
public static void main(String[] args) {
	p06.lecture.p7package.package1.MyClass1 o1 
	  = new p06.lecture.p7package.package1.MyClass1();
	// import 없이 쓸경우 이렇게 패키지명을 처음부터 작성하여 불러와야 함
	
	MyClass2 o2 = new MyClass2();
	// 1열의 package 밑에 패키지명을 import 시켜주면 됨!
	// ctrl + Shift + o 로 임포트 가능!
	
	
	MyClass3 o3 = new MyClass3();
}
}
