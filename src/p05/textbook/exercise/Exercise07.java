package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] array = {1, 5, 3, 8, 2};
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: " + min);
		
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		} System.out.println("합계:" + sum);
		
		avg = (double)sum / 5;
		System.out.println("평균:" + avg);
		
	}
}
