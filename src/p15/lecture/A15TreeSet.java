package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		
	TreeSet<Integer> set = new TreeSet<>();
	
	set.add(100);
	set.add(50);
	set.add(200);
	set.add(30);
	set.add(300);
	
	for(int n : set) {
		System.out.println(n);
	}
	
	System.out.println(set.first());      // 가장 작은 값
	System.out.println(set.last());       // 가장 큰 값
	
	System.out.println(set.lower(210));   // 210 기준으로 가장 가까운 작은 값
	System.out.println(set.higher(210));  // 210 기준으로 가장 가까운 큰 값
	
	System.out.println("내림차순 탐색");
	Iterator<Integer> di = set.descendingIterator();
	
	while(di.hasNext()) {
		System.out.println(di.next());
	}
	}
}
