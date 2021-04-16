package p09.lecture;

public class A05ThisKeyword {
	int i = 0;
	
	void method() {
		System.out.println(this.i);
	}
	
	class InnerClass {
		int i = 3;
		
		void method1() {
			int i = 4;
			System.out.println(i);                      // method1의 필드 i = 4에 접근
			System.out.println(this.i);                 // InnerClass의 필드 i = 3에 접근
			System.out.println(A05ThisKeyword.this.i);  // 바깥class를 명시해줘야 i = 0;에 접근
		}
	}

}
