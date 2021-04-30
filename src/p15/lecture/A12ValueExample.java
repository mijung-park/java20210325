package p15.lecture;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class A12ValueExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("spring", 11);
		map.put("summer", 13);
		map.put("fall", 11);
		map.put("winter", 13);
		
		Collection<Integer> values = map.values();
		for(int v : values) {
			System.out.println(v);
		}
		
	}
}
