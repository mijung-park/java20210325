package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		// 정수: byte, short, int, long
		
		// 자동 형변환
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		///////////////////////////////
		int intVar2 = 100;
		short shortVar2 = 100;
//		shortVar2 = intVar2; // int가 short보다 커서 안돼!
		
		// 강제 형변환 (type casting) casting
		// 작은타입의 명을 괄호안에 넣어서 앞에 넣어줌
		// 변환하고자 하는 단위안에 값이 담기면 문제X
		shortVar2 = (short) intVar2; //
		System.out.println(shortVar2);
		// 값이 담기지 않으면 값들이 손실될 수 있음 주의
		intVar2 = 2000000000;
		shortVar2 = (short) intVar2;
		System.out.println(shortVar2);
	}
}
