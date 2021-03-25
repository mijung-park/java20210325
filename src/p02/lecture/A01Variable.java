package p02.lecture;

public class A01Variable {
	public static void main(String[] args) {
		// 변수 " 값을 저장하는 공간의 이름
		// 변수 선언 방법:
		// type명과 변수명;
		int a;
		
		// 변수명 작성 규칙:
		// $, _, 영문대소문자, 숫자조합
		// 숫자가 앞에 오면 안됨.
		// 작성 관습: lowerCamelCase
		
		// type : 기본타입(8개), 참조타입(chapter 5)
		// 기본타입 : byte, short, int, long
		//            boolean, char, float, double
		
		// 값 할당 =, +=, *=, /=, %= : 할당 연산자 사용
		a = 5;
		System.out.println(a); // 5
		
		a = 7;
		System.out.println(a); // 7
		
		
	}
}
