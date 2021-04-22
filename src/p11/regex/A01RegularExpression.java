package p11.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규 표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier
	
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";
		
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);
		
		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d"; // 한개의 숫자
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3}"; // \\d이 3번 반복
		str1 = "987";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,}"; // \\d이 3개이상
		str1 = "987654321";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-6463-1824";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}"; // \\d가 3개~5개
		str1 = "121";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // 1개 이상 (\\d{1,})
		str1 = "1";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // 0개 이상
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // 0 또는 1
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-6463-1824";
		String str2 = "010-64631824";
		String str3 = "01064631824";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "\\w";
		str1 = "s";
		str2 = "S";
		str3 = "9";
		String str4 = "_";
		String str5 = " ";
		String str6 = "올";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));
		
		regex1 = "\\w\\d+";
		str1 = "e123456";
		str2 = "98765433245";
		str3 = "_4565751";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java)";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "(java)+";
		str1 = "javajavajava";
		str2 = "javajavajavajj";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "(java|python)";
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+";
		str1 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "."; // 아무문자나 다됨
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "9";
		str5 = "_";
		str6 = "올";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));
		
		regex1 = "\\."; //.만 쓰고싶을때
		str1 = ".";
		str2 = "$";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "[abc]"; // a, b, c중 하나의 문자만 가능 이외는 불가
		str1 = "a";
		str2 = "ab";
		str3 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "[^abc]"; // a, b, c만 빼고 하나의 문자만 가능 이외는 불가
		str1 = "a";
		str2 = "c";
		str3 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "[a-z]"; // a~z중 하나의 문자만 가능 이외는 불가
		str1 = "a";
		str2 = "A";
		str3 = "ab";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "[a-zA-Z]"; // a~z 또는 A~Z중 하나의 문자만 가능 이외는 불가
		str1 = "a";
		str2 = "A";
		str3 = "ab";
		str4 = "7";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		
		regex1 = "[가-힣]+";
		str1 = "박미정구리구리";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+";
		str1 = "박미정ㅋㅋㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
		
	}
	
}
