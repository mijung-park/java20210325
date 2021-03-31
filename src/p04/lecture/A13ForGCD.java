package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		// 최대공약수 : greatest common divisor
		// 두 수의 약수중에 가장 큰 수
		// ex : 12, 18 --> 6
		// ex : 5, 10 --> 5

		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("입력받은 두 수는 " + num1 + "과 " + num2);
		
		for (int i = num1; i >= 1; i--) {
			if ((num1 % i) == 0 && (num2 % i) == 0) {
				System.out.println("최대공약수는: " + i);
				return;
			}
		}
		
		scanner.close();
	}
}
