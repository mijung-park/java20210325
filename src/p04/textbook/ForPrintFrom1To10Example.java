package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		// 1 ~ 10 홀수
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
			
		}
		
		// 1 ~ 10 짝수
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		
		// 10 ~ 1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		// 10 ~ 1 짝수
		for (int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		
		// 10 ~ 1 홀수
		for (int i = 10; i > 0; i--) {
			if (i % 2 == 1) {
			System.out.println(i);
			}
		}
	}
}
