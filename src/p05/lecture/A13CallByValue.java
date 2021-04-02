package p05.lecture;

public class A13CallByValue {
	public static void main(String[] args) {
		System.out.println("main statement1");
		
		method1(); // 호출하면 해당 method안의 내용을 실행
		
		method1(); // 호출 할때마다 실행
		
		method2(5); // int method이기 때문에 꼭 숫자를 넣어줘야함
		
		method2(10);
		
		System.out.println("main statement2");
	}
	
	public static void method1() {
		System.out.println("method1 statement1");
		System.out.println("method1 statement2");
	}
	
	public static void method2(int i) {
		System.out.println("method2 statement1");
		System.out.println(i);
		System.out.println("method2 statement2");
	}
}
