package p08.textbook.s080506;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");	
	}
	
	public void checkFare() {
		System.out.println("요금을 지불합니다.");
	}
}
