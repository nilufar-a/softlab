package softlab;

public class TunnelEntrance extends TrackSegment{
	boolean isActive;
	TunnelEntrance otherEntrance;
	
	public TunnelEntrance(String name) {
		super(name);
		System.out.println("Tunnel Entrance has been created");
		isActive = false;
	}
	public boolean isActivated() {
		return isActive;
	}
	public void accept(Vehicle v) {
		System.out.println("Vehicle is in the station now");
	}
	
	public void remove(Vehicle v) {
		System.out.println("Vehicle left the station");
	}
	public void activate() {
		isActive = true;
		System.out.println("Tunnel Entrance activated");
	}
	public void deactivate() {
		isActive = false;
		System.out.println("Tunnel Entrance deactivated");
	}
	public void transitToExit() {
		System.out.println("Vehicle has been transited");
	}

}
