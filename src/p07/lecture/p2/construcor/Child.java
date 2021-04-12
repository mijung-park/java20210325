package p07.lecture.p2.construcor;

public class Child extends Parent {
	// 하위클래스의 생성자는 상위클래스 생성자를 꼭 호출해야함.
	
//	public Child() { //기본생성자
////		super(); 기본생성자 호출. 생략가능!
//		super(3); // argument가 있는 생성자를 호출할때는 반드시 호출 해야함
//	}

	private int j;
	
	public Child(int i, int j) {
		super(i);
		this.j = j;
	}
	
}
