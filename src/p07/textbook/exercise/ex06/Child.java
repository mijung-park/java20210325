package p07.textbook.exercise.ex06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super(); 생략되어있음
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
