package p08.textbook.s080506;

public class DriverExample {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new Bus());
		d.drive(new Taxi());
	}
}
