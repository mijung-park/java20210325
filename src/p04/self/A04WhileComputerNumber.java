package p04.self;

import java.util.Scanner;

public class A04WhileComputerNumber {
	public static void main(String[] args) {
		int comNum = (int) (Math.random() * 100) + 1;
		System.out.println("ComputerNumber : " + comNum);

		System.out.println("컴퓨터의 수를 맞춰보세요");
		Scanner scan = new Scanner(System.in);
		

		
		while (true) {
			int userNum = scan.nextInt();
			
			if (userNum > comNum) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (comNum > userNum) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("정답입니다!!!!");
				break;
			}
		}
		scan.close();
		System.out.println("프로그램을 종료합니다.");
		
	}
}
