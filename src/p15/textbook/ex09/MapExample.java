package p15.textbook.ex09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		int avg = 0;
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(value > maxScore) {
				name = key;
				maxScore = value;
			}
			totalScore += value;
		} 
		System.out.println("평균점수: " + (double)totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
				

//		List<Integer> lists = new ArrayList();
//
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			int list = entry.getValue();
//			totalScore += list;
//			avg = totalScore / map.size();
//			lists.add(list);	
//			
//		} System.out.println("평균점수: " + avg );
//	
//		
//		for (int i = 0; i < lists.size(); i++) {
//			if(maxScore < lists.get(i)) {
//				maxScore = lists.get(i);
//			}
//		} System.out.println("최고점수: " + maxScore);
//		
//		for(Map.Entry<String, Integer> entry : map.entrySet()) {
//			name = entry.getKey();
//		} System.out.println("최고점수를 받은 아이디: " );
//		
	}
}
