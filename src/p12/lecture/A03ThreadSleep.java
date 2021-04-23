package p12.lecture;

public class A03ThreadSleep {
	// 실행 흐름을 잠시 멈춤. millisecond 단위. 1초 = 1000
	
	public static void main(String[] args) {
		
		System.out.println("실행1");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행2");
	}
}
