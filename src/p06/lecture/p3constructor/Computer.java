package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	// 위에 model, memory와 타입 & 갯수 & 순서가 같아서 안됨!
//	Computer(String cpul, int ssd) {
//		
//	}
	
	Computer(String model) {
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	// 파라미터의 타입 & 갯수 & 순서가 같은 다른 생성자를 만들 수 없음
//	Computer(String cpu) {
//		this.model = "hp";
//		this.memory = 4;
//		this.cpu = "cpu";
//		this.ssd = 128;
//	}
}
