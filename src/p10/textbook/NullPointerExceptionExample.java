package p10.textbook;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		if (data != null) {
			System.out.println(data.toString());
		}
		System.out.println(data.toString());
	}
}
