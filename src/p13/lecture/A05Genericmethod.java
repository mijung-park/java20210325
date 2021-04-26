package p13.lecture;

public class A05Genericmethod {
	public static void main(String[] args) {
		
	MyClass5 o1 = new MyClass5();
	o1.<String>method1();
	o1.<String>method2();
	o1.method2();
	
	o1.<String>method3();
	
	String s = o1.method3();
	System.out.println(s);
	
	
	}

}

class MyClass5 {
	
	public <T> void method1() {
	}
	
	public <T> void method2() {		
	}
	
	public <T> T method3() {
		return null;
	}
}