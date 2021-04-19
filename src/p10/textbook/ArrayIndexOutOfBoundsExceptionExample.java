package p10.textbook;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("args의 길이: " + args.length);
		
		if (args.length >= 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
	}
}
