
public class TestVehicle {

	public static void main(String[] args) {
		Scooty s = new Scooty();
		System.out.println("Scooty uses "+s.fuel());
		
		Car c = new Car();
		System.out.println("Car uses "+c.fuel());
		
		Bus b = new Bus();
		System.out.println("Bus uses "+b.fuel());
	}

}
