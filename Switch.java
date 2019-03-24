
public class Switch extends TrackSegment{
	CrossRail crossRail;
	
	public Switch() {
		System.out.println("Switch has been created");
	}
	
	public void setSwitch() {
		System.out.println("Switch has been set");
	}
	public void accept(Vehicle v) {
		System.out.println("Vehicle is in the station now");
	}
	
	public void remove(Vehicle v) {
		System.out.println("Vehicle left the station");
	}
}
