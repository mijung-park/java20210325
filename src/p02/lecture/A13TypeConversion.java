package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		// float : 4byte (32bit)
		
		// float 저장법
		// 부호비트 1
		// 지수비트 8
		// 가수비트 23
		// 0(부호)000 0000 0(지수)000 0000 0000 0000 0000 0000 0000(가수)
		
		int intVar1 = 66977791;
		float floatVar1 = intVar1;
		System.out.println(floatVar1);
		// 출력값 6.6977792E7
		// 저장가능한 범위를 벗어나서 근사치로 출력
		
		
		// double 저장법 (8byte)
		// 부호비트 1
		// 지수비트 11
		// 가수 52
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1);
		// 출력값 6.6977791E7 제대로 출력
	}
}
