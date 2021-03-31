package p04.lecture;

public class A09For {
	public static void main(String[] args) {
		System.out.println("실행문 1");
		
		// 실행순서:
		// 1번 -> 2번 - true -> 코드블럭 -> 3번 -> 2번
		//              false -> 종료

		for (int i = 0; i < 3; i++) {
			System.out.println("반복할 코드들..." + i);
		}

		System.out.println("실행문 2");
	}
}
