package p13.lecture;

public class A03Generic {
	public static void main(String[] args) {
		
	Generic3<String> g3 = new Generic3<>();
	g3.setO("java");
	String s = g3.getO();
	System.out.println(s);
	
	Generic3<Integer> g4 = new Generic3<>();
	g4.setO(999);
	int i = g4.getO(); // auto unboxing
	System.out.println(i);
	
	Generic3<Double> g5 = new Generic3<>();

	}
}

class Generic3<T> {
	private T o;
	
	public void setO(T o) {
		this.o = o;
	}
	
	public T getO() {
		return o;
	}
}