package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	// Set : 순서가 없고, 중복 불가
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(8);
		set.add(2);
		
		System.out.println(set.size());
		
		set.add(9);
		
		System.out.println(set.size()); // 9가 이미 존재하기때문에 add가 되지않음. size는 여전히 3 !
		
		boolean c = set.contains(9);
		System.out.println(c);
		System.out.println(set.contains(3));
		
		set.remove(9);
		System.out.println(set.size());
		
		set.add(9);
		set.add(3);
		set.add(2);
		System.out.println(set.size());
		
		Iterator<Integer> iter = set.iterator();
		
		/*
		System.out.println(iter.hasNext());
		Integer i1 = iter.next();
		System.out.println(iter.hasNext());
		Integer i2 = iter.next();
		System.out.println(iter.hasNext());
		Integer i3 = iter.next();
		System.out.println(iter.hasNext());
		Integer i4 = iter.next();
		System.out.println(iter.hasNext());
		Integer i5 = iter.next(); // 아이템이 4개밖에 없어서 4개만 가능. 5번째 exception발생
		*/
		
		while (iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
		
		
	}
}
