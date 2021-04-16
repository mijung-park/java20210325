package p09.lecture;

public interface MyInterface {
	public static void main(String[] args) {
		int localVar = 3;

		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};
	}
}
