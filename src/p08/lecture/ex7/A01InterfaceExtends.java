package p08.lecture.ex7;

public class A01InterfaceExtends {
	public static void main(String[] args) {
		MyInterface2 i2 = new MyInterface2() {
			@Override
			public void mehtod1() {
				System.out.println("MyInterface1 method1");	
			}
			@Override
			public void method2() {
				System.out.println("MyInterface2 method2");
			}
			
		
		};
	}

}

interface MyInterface1 {
	void mehtod1();
	
}

interface MyInterface2 extends MyInterface1 {
	void method2();
	
}
