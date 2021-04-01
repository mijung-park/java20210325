package p05.lecture;

import java.util.Scanner;

public class A01ReferenceType {
	public static void main(String[] args) {
		// 자료형 (2가지)
		// 1. 기본타입 (원시타입) primitive type
		// ㄴ> byte, short, int, long, float, double, char, boolean
		
		// 2. 참조타입 reference type
		// ㄴ> 기본타입 외 모든 무한의 타입
		
		// 차이점
		// 기본타입은 데이터를 저장
		// 참조타입은 테이터를 저장한 객체의 참조를 저장
		
		// 예제 (기본타입)
		int i;
		i = 3;
		
		// 예제 (참조타입)
		Scanner scanner; 
		scanner = new Scanner(System.in);
	}
}
