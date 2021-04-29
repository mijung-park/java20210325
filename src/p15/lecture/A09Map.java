package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(2, 99);
		map.put(3, 6);
		map.put(8, 77);
		System.out.println(map.size());
		
		map.put(8, 88);  // 8은 이미 기존에 있던 key. value를 덮어씀!
		System.out.println(map.size());
		
		System.out.println(map.get(2));
		System.out.println(map.get(8));
		
		Set<Integer> keys = map.keySet();  // key 값 확인
		
		for(Integer key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		map.remove(8);
		System.out.println(map.size());
		
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		System.out.println(entries);
		
		for (Map.Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
