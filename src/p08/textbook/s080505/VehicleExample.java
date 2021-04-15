package p08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle v = new Bus();
		
		v.run();
		//v.checkFare();
		
		Bus b = (Bus) v;
		
		b.run();
		b.checkFare();
		
	}
}
