
public class CrossRail extends TrackSegment {
	TrackSegment [] possibleSegments;
	TrackSegment currentSegment;
	
	public CrossRail() {
		System.out.println("CrossRail has been created");
	}
	TrackSegment[] getDirection() {
		System.out.println("Train continues to move from fork");
		return possibleSegments;
	}
	public void changeDirection() {
		System.out.println("Current direction has been changed");
	}
	public void accept(Vehicle v) {
		System.out.println("Vehicle is in the station now");
	}
	
	public void remove(Vehicle v) {
		System.out.println("Vehicle left the station");
	}
}
