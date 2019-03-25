package softlab;

import java.util.ArrayList;

public class Map {

	private int totalPassangers;
	private ArrayList<TrackSegment> trackSegments;
	private String name;
	
	
	public Map(String name) {
		this.name=name;
		trackSegments=new ArrayList<TrackSegment>();
	}
	
	public void removePassengers(int count) {
		totalPassangers-=count;
		System.out.println("The number of Passanger was decreased by "+count);
	}
	public void addTrackSegment(TrackSegment ts) {
		trackSegments.add(ts);
	}
	public String getObjectName() {
		return name;
	}
}
