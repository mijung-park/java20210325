package p11.lecture.wrapper;

public class A01Wrapper {
	public static void main(String[] args) {
		// 8개 기본타입
		// 나머지는 모두 참조타입
		
		// Wrapper class들
		// Byte, Short, Integer, Long
		// Character, Boolean
		// Float, Double
		
		Integer i1 = new Integer(100);
		System.out.println(i1.hashCode());
		System.out.println(System.identityHashCode(i1));
		
	
		Object[] arr1 = new Object[] {"java", 3, true, 3.13, 'a'};
		
		Object o1 = new Integer(3); // int3을 object안에 넣을 수 없었우... 그래서
		Object o2 = 3; // Auto Boxing
		
//		int intVar1 = o1; // Object를 int안에 넣을수는 없음
		
		Integer i2 = new Integer(99);
		int intVar2 = i2; // Auto UnBoxing
		
		intVar2 = i2.intValue(); // Boxing
	}
}
