package softlab;

import java.util.ArrayList;

public class TrackSegment {
	private ArrayList<Vehicle> vehicles;
	private TrackSegment neighboorField1;
	private TrackSegment neighboorField2;
	protected String name;
	
	public TrackSegment(String name) {
		vehicles=new ArrayList<>();
		this.name=name;
		System.out.println("\n"+this.getObjectName()+" has been created");
	}
	public TrackSegment getNextSegment(Direction dir) {
		System.out.println("The next segment was returned: "+neighboorField1.getObjectName());
		return neighboorField1;
	}
	public boolean checkCollide() {
		if (vehicles.size()>1) {
			System.out.println("\nCollision was detected");
			return true;
		}
		else
		{
			System.out.println("\nCollision wasn't detected");
			return false;
		}
	}
	public void accept(Vehicle v) {
		vehicles.add(v);
		System.out.println("\n"+v.getObjectName()+" was added to the "+this.getObjectName());
		
	}
	
	public void remove(Vehicle v) {
		vehicles.remove(v);
		System.out.println("\n"+v.getObjectName()+" was deleted from the "+this.getObjectName());
	}
	
	public Vehicle getOtherVehicle() {
		if(vehicles.size()!=2) return null;
		System.out.println("\nThe other vehicle on the "+this.getObjectName()+" is "+vehicles.get(0).getObjectName());
		return vehicles.get(0);
	}
	
	public String getObjectName() {
		return name;
	}
	
	public void setNeighboor(TrackSegment ts,Direction dir) {
		neighboorField1=ts;
	}
}
