package p05.lecture;

public class A06StringEquals {
	public static void main(String[] args) {
		String s = new String("java"); // 객체저장소1
		String t = "java"; // 객체저장소2
		String u = "java"; // 객체저장소3
		
	boolean d1 = s.equals(t);
	System.out.println(s == t); // false
	System.out.println(d1);     // true
	
	System.out.println(s.equals(s)); // true
	System.out.println(t.equals(u)); // true
	}
}
