package ex0807.ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus); // -> driver.drive(new Bus()); 동일
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}
