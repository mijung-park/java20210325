package p06.lecture.p8access_modifier.package1;

public class MyClass1 {
	public int i;
	private int j;
	int k; //default, package private
	
	public MyClass1() {
		
	}
	
	private MyClass1(int a) {
		
	}
	
	MyClass1(int i, int j) {
		
	}
	
	private void method1() {
		
	}
	
	public void method2() {
		
	}
	
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void method4() {
		
	}
	
	static void method5() {
		
	}
	
	private static void method6() {
		
	}
	
}
