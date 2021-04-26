package p13.textbook.ex02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<>();
		container1.setT("홍길동");
		String str = container1.getT();
		
		Container<Integer> container2 = new Container<>();
		container2.setT(6);
		int value = container2.getT();
		
	}
}

class Container<T> {
	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
