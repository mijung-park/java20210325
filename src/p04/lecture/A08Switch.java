package p04.lecture;

public class A08Switch {
	public static void main(String[] args) {
		// switch case : 값이 일치하는 case문"부터" 실행
		// 해당케이스만 실행을 원하면 break문으로 멈춰줘!!!
		// 만약 일치하는 case가 없으면 default 부터 실행
		// 사용할 수 있는 type: byte, short, char, int, string, Enum
		
		int a = 1;
		
		switch (a) {
		case 1:
			System.out.println("케이스 1");
			break;
		case 2:
			System.out.println("케이스 2");
			break;
		case 3:
			System.out.println("케이스 3");
		}
		
		
		
	}
}
