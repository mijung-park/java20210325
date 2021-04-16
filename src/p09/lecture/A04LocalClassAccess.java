package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		// param과 localVarm는 묵시적 final(Effectively final)
		
		int localVar = 3;
//		localVar = 4;
//		param = 1; 
		// parameter와 지역변수를 로컬클래스에서 사용하면 값을 변경할 수 없음.
		// final과 동일! 생략만 한것임!
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
