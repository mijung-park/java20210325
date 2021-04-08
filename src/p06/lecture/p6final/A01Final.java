package p06.lecture.p6final;

public class A01Final {
	final static int f = 55;
	
//	static {
//		f = 55;
//	}
	
	final static double PI = 3.1415; //일케 절대 변하지않는 상수값들을 final로 씀
	// final의 변수명은 관습상 SNAKE_CASE로 작성!
	
	int a;
	final int b;
	
	A01Final() {
		this.b = 9;
	}
	
	public static void main(String[] args) {
		// final 변수(지역변수, 파라미터, 필드)
		// 값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		j = 3;
		j = 5;
		
		i = 9;
//		i = 10; 이미 9를 할당 받아서 안됨
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 3; // 호출될때 할당받은 값을 할당하기 때문에 요기 할당할 수 없어
	}
}
