package p15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayList {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 100;
		arr1[2] = 101;
//		arr1[3] = 102;  // 배열에 3개만 저장가능하기때문에 4번째에서 오류발생
		
		arr1 = Arrays.copyOf(arr1, 4);
		arr1[3] = 102;
		
		System.out.println(Arrays.toString(arr1));
				
		
		List<Integer> list = new ArrayList<>();
		list.add(99);
		list.add(100);
		list.add(101);
		list.add(102);
		
		System.out.println(list);
	}
}
