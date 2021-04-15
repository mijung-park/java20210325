package p08.textbook.s080701;

public interface MyInterface {
	public void mehtod1();
	public default void method2() {
		System.out.println("myinterface-method2");
	};
}
