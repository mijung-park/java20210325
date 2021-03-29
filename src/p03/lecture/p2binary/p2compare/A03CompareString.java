package p03.lecture.p2binary.p2compare;

public class A03CompareString {
	public static void main(String[] args) {
		
		// String 크기 비교 불가
		
		String a = "abc";
		String b = "def";
//		System.out.println(a < b);
		
		String c = "a";
		String d = "b";
//		System.out.println(c < d);
		
		char e = 'a';
		char f = 'b';
		System.out.println(e < f);
		
		//동등한가(==) 동등하지 않은가(!=)는 비교가능
		
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);
		
		String str3 = "ja";
		String str4 = "va";
		String str5 = str3 + str4;
		System.out.println(str1); // java
		System.out.println(str5); // java
		
		System.out.println(str1 == str5);
		
		// equals : 문자열이 같은지 확인하는 메소드
		
		System.out.println(str1.equals(str5));
		
	}
}
