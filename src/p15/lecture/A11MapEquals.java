package p15.lecture;

import java.util.HashMap;
import java.util.Map;

public class A11MapEquals {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put(new String("java"), 99);
		map.put(new String("html"), 100);
		map.put(new String("java"), 200);
		
		System.out.println(map.size());
		System.out.println(map.get("java"));
		
		Map<Computer, Integer> map2 = new HashMap<>();
		
		map2.put(new Computer(100), 30000);
		map2.put(new Computer(200), 40000);
		map2.put(new Computer(100), 70000);
		
		System.out.println(map2.size());
		System.out.println(map2.get(new Computer(100))); 
		// Computer 클래스에서 model이 같으면 같은 객체로 인식하도록 
		// hashCode와 equals메소드를 재정의 해줌.
		// 만약 재정의 하지 않았다면 size는 3. get값은 null;
	}
}

class Computer {
	private int model;
	
	public Computer(int model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + model;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (model != other.model)
			return false;
		return true;
	}
	
	
}
