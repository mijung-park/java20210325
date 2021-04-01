package p04.textbook;

import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {

		// 3번 문제
//		int sum = 0;
//		for (int i = 0; i <=100; i++) {
//			if (i % 3 == 0) {
//			sum += i;
//			}
//		} System.out.println("3의 배수의 합: " + sum);
//		
		// 4번 문제
//
//		ex) 1
//		int num1 = 0;
//		int num2 = 0;
//		do {			
//			num1 = (int)(Math.random()*6) +1;
//			num2 = (int)(Math.random()*6) +1;
//			System.out.println("(" + num1 + ", " + num2 + ")" );
//			
//		} while (num1 + num2 != 5);
		
//		ex) 2
//		while (true) {
//			int num1 = (int)(Math.random()*6) +1;
//			int num2 = (int)(Math.random()*6) +1;
//			System.out.println("(" + num1 + ", " + num2 + ")" );
//			if (num1 + num2 == 5) {
//				break;
//			}			
//		}
		

		// 5번 문제
//
//		for (int x = 1; x <=10; x++) {
//			for (int y = 1; y <=10; y++) {
//				if ((4*x)+(5*y) == 60) {
//					System.out.println("(" + x + ", " + y + ")");
//				}
//			}
//		}

		// 6번 문제
		
//		// ex) 1
//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// ex) 2
//		String line = "";
//		for (int i = 0; i < 5; i++) {
//			line += "*";
//			System.out.println(line);
//		}
		
		// 7번 문제
		
		// ex) 1
//		boolean run = true;
//		int balance = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		while (run) {
//			System.out.println("---------------------------------");
//			System.out.println("1.에금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("---------------------------------");
//			System.out.print("선택>");
//
//			int bank = scanner.nextInt();
//			
//			if (bank == 1) {
//				int amount = scanner.nextInt();
//				balance += amount;
//				System.out.println("예금액> " + balance);
//			} else if (bank == 2) {
//				int amount = scanner.nextInt();
//				balance -= amount;
//				System.out.println("출금액> " + amount);
//			} else if (bank == 3) {
//				
//				System.out.println("잔고> " + balance);
//			} else if (bank == 4)  {
//				run = false;
//			}
//			System.out.println();
//		}
//		System.out.println("프로그램 종료");
//		
//		//ex 2
//		boolean run = true;
//		int balance = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		while (run) {
//			System.out.println("---------------------------------");
//			System.out.println("1.에금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("---------------------------------");
//			System.out.print("선택>");
//		
//
//			int bank = scanner.nextInt();
//			
//			switch (bank) {
//			case 1:
//				System.out.println("예금액>");
//				int amount = scanner.nextInt();
//				balance += amount;		
//				break;
//			case 2:
//				System.out.println("예금액>");
//				amount = scanner.nextInt();
//				balance -= amount;
//				break;
//			case 3:
//				System.out.println("잔고> " + balance);
//				break;
//			case 4:
//				run = false;
//				break;
//			}
//		}

	}
}
