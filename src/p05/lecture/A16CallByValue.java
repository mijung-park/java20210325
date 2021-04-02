package p05.lecture;

public class A16CallByValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 2;
			System.out.println(arr1[i]);
		}
		
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 100 * i;
		}
		
		print(arr1);
		
		print(arr2);
		
	}
	
	public static void print(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
