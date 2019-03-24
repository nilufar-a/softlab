package softlab;

import java.util.ArrayList;

public class Game {

	private ArrayList<Map> levels;
	private Map currentLevel;
	
	public Game() {
		levels=new ArrayList<Map>();
		Map firstLevel=new Map();
		levels.add(firstLevel);
	}
	
	public void startGame() {
		System.out.println("\nThe Game has been started");
		initiateMap(levels.get(0));
	}
	
	public void initiateMap(Map level) {
		System.out.println("\nThe Map has been initiated");
		currentLevel=level;
		TrackSegment ts=new TrackSegment();
		currentLevel.addTrackSegment(ts);
		System.out.println("\nTrack segment has been created");
		Engine e=new Engine();
		Timers.addEngine(e);
		System.out.println("\nEngine has been created");
		Car c=new Car();
		Timers.addCar(c);
		System.out.println("\nCar has been created");
	}
	
	public void nextLevel() {
		
	}
	
	public Map getCurrentLevel() {
		return currentLevel;
	}
	
	public void endGame() {
		
	}
	
}
