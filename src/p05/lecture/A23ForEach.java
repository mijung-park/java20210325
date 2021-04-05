package p05.lecture;

public class A23ForEach {
	public static void main(String[] args) {
		// for each
		// 향상된 for문
		
		int[] arr1 = {9, 8, 7, 6};
		
		
		// for
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// for each
		for(int n : arr1) {
			System.out.println(n);
		}
		
//		for (2.아이템의 갯수: 1.나열가능한객체) {
//			3.실행문
//		}
	}
}
