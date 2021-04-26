package p13.lecture;

public class A02Generic {
	// Generic이 없던 시절..
	
	public static void main(String[] args) {
		Generic2 g2 = new Generic2();
		g2.setO("java");
		String s = (String) g2.getO();
		
		g2.setO(22); // int-> Integer로 auto boxing이 일어남 (22는 object가 아니기때문)
		Integer i = (Integer) g2.getO();
		
		g2.setO(3.14); 
		Integer d = (Integer) g2.getO(); // class casting exception 발생
		System.out.println(d);
		
		
	}
	
}

class Generic2 {
	private Object o;
	
	public void setO(Object o) {
		this.o = o;
	}
	
	public Object getO() {
		return o;
	}
}
