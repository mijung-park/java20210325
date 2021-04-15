package p08.textbook.s080506;

public class Driver {
	public void drive(Vehicle v) {
		if (v instanceof Bus) {
			Bus b = (Bus) v;
			b.checkFare();
		}
		v.run();
	}

}
