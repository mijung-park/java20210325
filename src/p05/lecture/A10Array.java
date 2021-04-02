package p05.lecture;

import java.util.Arrays;

public class A10Array {
	public static void main(String[] args) {
		// array (배열) : 여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int[] arr; // 배열도 참조타입
		arr = new int[3]; // 3개의 int를 넣을 수 있는 저장소가 생김
		arr[0] = 5;
		arr[1] = 7;
		// 설정하지 않으면 기본값 0이 출력
		
		System.out.println(arr[0]); // 5
		System.out.println(arr[1]); // 7
		System.out.println(arr[2]); // 0
		
		// arr 내용을 한번에 출력
		System.out.println(Arrays.toString(arr));
	}
}
