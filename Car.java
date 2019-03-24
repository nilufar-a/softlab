package softlab;

public class Car extends Vehicle {
	
	int passangerCount;
	boolean isVisible;
	int position;
	Color color;
	
	public void setPosition(int n) {
		position=n;
	}
	
	public void alight() {
		System.out.print("\nPassangers alighted\n");
		passangerCount=0;
	}
	
	public void setVisible() {
		System.out.print("\nCar is now visible\n");
		isVisible=true;
	}
	
	public void setInvisible() {
		System.out.print("\nCar is not visible now\n");
		isVisible=false;
	}
	
	boolean isEmptyTillEngine() {
		
		for(int i =position; i>=0; i--) {
			if(this.cars[i-1].passangerCount!=0) {
				return false;
			} else {
				this.cars[i-1].isEmptyTillEngine();
			}	
			
		}
		return true;
	}
	
}
