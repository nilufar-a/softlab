package softlab;

import java.util.ArrayList;

public class TrackSegment {
	private ArrayList<Vehicle> vehicles;
	private TrackSegment neighboorField1;
	private TrackSegment neighboorField2;
	
	public TrackSegment() {
		vehicles=new ArrayList<>();
	}
	public TrackSegment getNextSegment(Direction dir) {
		System.out.println("The next segment was returned");
		return neighboorField1;
	}
	public boolean checkCollide() {
		if (vehicles.size()>1) {
			System.out.println("Collision was detected");
			return true;
		}
		else
		{
			System.out.println("Collision wasn't detected");
			return false;
		}
	}
	public void accept(Vehicle v) {
		vehicles.add(v);
		System.out.println(v.getClass().getSimpleName()+" was added to the trackSegment");
	}
	
	public void remove(Vehicle v) {
		vehicles.remove(v);
		System.out.println(v.getClass().getSimpleName()+" was deleted from the trackSegment");
	}
}
