package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		// long: 8byte(64bit)
		
		System.out.println("최대값");
		System.out.println(Long.MAX_VALUE);
		System.out.println("최소값");
		System.out.println(Long.MIN_VALUE);
		
		
		long longVar;
//		longVar = 9223372036854775807; 
//		java의 기본 값이 int로 되어있어 java literal값을 넘어감
//		뒤에 대문자L 을 입력해줘야 long으로 인식
		longVar = 9223372036854775807L; //922경...ㄷㄷㄷ;;
		longVar = -9223372036854775808L;
		
		longVar = 1_000_000;
		longVar = 100_0000;
		
	}
}
