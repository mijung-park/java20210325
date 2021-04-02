package p05.lecture;

public class A09Null {
	public static void main(String[] args) {
		// Null : 참조하는 객체(instance)가 없음
		
		String s = "java";
		String t = "java";
		
		t = null;
		s = null;
	
		// 현재 "java"가 저장되어있는 instance는 비어있음
		// 자바프로그램이 알아서 빈 저장소를 찾아서 비워줌
		// ㄴ> GC (garbage collector)라 함
	
	}
}
