package softlab;

public class Station extends TrackSegment {
	
	Color color;
	Car carBefore;
	
	public boolean checkColor(Color c) {
		if(this.color==c) {
			return true;
		}
		
		else 
			return false;
	}
	
	public void accept(Vehicle v) {
		System.out.print("\nVehicle is in the station now\n");
	}
	
	public void remove(Vehicle v) {
		System.out.print("\nVehicle left the station\n");
		
	}

}
