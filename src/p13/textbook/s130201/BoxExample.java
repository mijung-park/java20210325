package p13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String) box.get();
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.get();
	}

}

class Box {
	private Object object;
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}

class Apple {}
