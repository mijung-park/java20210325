package p04.self;

import java.util.Scanner;

public class A01GCD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		for (int i = num1; i >=1; i--) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				System.out.println("두 수의 최대 공약수는 " + i + " 입니다.");
				return;
			} 
		}
		scan.close();
	}
}
