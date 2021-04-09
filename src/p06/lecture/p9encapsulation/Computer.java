package p06.lecture.p9encapsulation;

public class Computer {
	private String cpu;
	private int ram; // 1보다 작으면 안된다는 조건을 주고싶음

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public void setRam(int ram) {
		if (ram < 1) {
			System.out.println("입력할 수 없습니다.");
		} else {
			this.ram = ram;
		}
	}

	public int getRam() {
		return this.ram;
	}

}
