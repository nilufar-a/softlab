package softlab;

import java.util.ArrayList;


public class Engine extends Vehicle {
	
	private boolean isVisible; 
	private ArrayList<Car> cars;
	
	public Engine(String name) {
		this.name=name;
		cars=new ArrayList<>();
		System.out.println("\n"+this.getObjectName()+" has been created");
	}
	
	public void move(Direction dir) {
		System.out.println("\n"+this.getObjectName()+" is moving..\n");
		if(segment!=null) {
			TrackSegment next=segment.getNextSegment(Direction.Up);
			segment.remove(this);
			this.setSegment(next);
			System.out.println("\n"+this.getObjectName()+" has successfully moved from "+segment.getObjectName()+" to "+next.getObjectName()+"!");
			
			System.out.println("\nDoes "+this.getObjectName()+" has any car?");
			if(cars.size()!=0) {
				System.out.println("\nYES!");		
				pullCar(dir);
			}
			else
				System.out.println("\nNO!");
		}
	}
	public void pullCar(Direction d) {
		System.out.println("\n"+this.getObjectName()+" started to pull cars...");
		for(int i=0;i<cars.size();++i) {
			cars.get(i).move(d);
			System.out.println("\nDoes "+cars.get(i).getObjectName()+" has the next car?");
			if(i==cars.size()-1)
				System.out.println("\nNO!");
			else
				System.out.println("\nYES!");
		}
		
	}
	public void addCar(Car c) {
		cars.add(c);
	}
	
	
public void setVisible() {
	
	isVisible=true;
	 System.out.print("set visible");
}
	
public void setInvisible() {
	isVisible=false;
 System.out.print("set invisible");
}};
