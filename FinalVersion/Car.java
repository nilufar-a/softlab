package softlab;

public class Car extends Vehicle {
	
	int passangerCount;
	boolean isVisible;
	int position;
	Color color;
	
	public Car(String name) {
		this.name=name;
		System.out.println("\n"+this.getObjectName()+" has been created");
	}
	
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
		
		for(int i =position; i>0; i--) {
			if(this.cars[i-1].passangerCount!=0) 
				return false;
		}
		return true;
	
	}

	@Override
	public void move(Direction dir) {
		System.out.println("\n"+this.getObjectName()+" is moving..\n");
		if(segment!=null) {
			TrackSegment next=segment.getNextSegment(Direction.Up);
			segment.remove(this);
			this.setSegment(next);
			System.out.println("\n"+this.getObjectName()+" has successfully moved from "+segment.getObjectName()+" to "+next.getObjectName()+"!");
		}
	}
}
