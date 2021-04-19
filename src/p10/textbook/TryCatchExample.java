package p10.textbook;

public class TryCatchExample {

	public static void main(String[] args) {

		System.out.println("프로그램 실행");

		try {
			System.out.println("try 블럭 시작");

			Class clazz = Class.forName("java.lang.String2");

			System.out.println("try 블럭 종료");

		} catch (ClassNotFoundException e) {
			System.out.println("catch 블럭 시작");

			System.out.println("클래스가 존재하지 않습니다.");

			System.out.println("catch 블럭 종료");
		}

		System.out.println("프로그램 종료");
	}
}
