package p02.lecture;

public class A12TypeConversion {
	public static void main(String[] args) {
		// 실수
		float floatVar1 = 3.14F;
		double doubleVar1;
		
		// 자동 형변환
		doubleVar1 = floatVar1;
		
		// 강제 형변환 (casting)
//		floatVar1 = doubleVar1; //X
		floatVar1 = (float) doubleVar1;
		
		/////////////////////////////////
		// 정수 -> 실수
		int intVar1 = 3;
		float floatVar2 = intVar1; // 자동 형변환
		double doubleVar2 = intVar1; // 자동 형변환
		
		// 실수 -> 정수
		double doubleVar3 = 3.14;
//		int intVar3 = doubleVar3; //X
		int intVar3 = (int) doubleVar3; // casting
		System.out.println(intVar3);
		// int가 정수이기때문에 소수점을 잃어버리고 3만 출력
	}
}
