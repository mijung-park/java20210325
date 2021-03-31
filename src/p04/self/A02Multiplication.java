package p04.self;

public class A02Multiplication {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		
		System.out.println("짝단만 출력");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 0)
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		// 두가지 방법 이용가능 !
	}
}
