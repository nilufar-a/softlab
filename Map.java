package softlab;

import java.util.ArrayList;

public class Map {

	private int totalPassangers;
	private ArrayList<TrackSegment> trackSegments;
	
	public Map() {
		trackSegments=new ArrayList<TrackSegment>();
	}
	
	public void removePassengers(int count) {
		totalPassangers-=count;
	}
	public void addTrackSegment(TrackSegment ts) {
		trackSegments.add(ts);
	}
}
