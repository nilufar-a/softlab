package softlab;

public class Vehicle {
	
	Car cars[];
	Engine engine;
	
	public void move() {
		System.out.print("\nVehicle moves\n");
	}
	
	public void collide() {
		System.out.print("\nVehicle collides\n");
	}
}
