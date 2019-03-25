package softlab;

import java.util.ArrayList;

public class Game {

	private ArrayList<Map> levels;
	private Map currentLevel;
	
	public Game() {
		
	}
	
	public void startGame() {
		System.out.println("\nThe Game has been started");
		levels=new ArrayList<Map>();
		Map firstLevel=new Map("first");
		levels.add(firstLevel);
		initiateMap(levels.get(0));
	}
	
	public void initiateMap(Map level) {
		System.out.println("\nThe Map has been initiated");
		currentLevel=level;
		TrackSegment ts=new TrackSegment("ts");
		currentLevel.addTrackSegment(ts);
		Timers timer=new Timers();
		Engine e1=new Engine("e");
		timer.addEngine(e1);
		Car c1=new Car("c");
		timer.addCar(c1);
	}
	
	public void nextLevel() {
		System.out.println("You passed the "+currentLevel.getObjectName()+" level. CONGRATULATIONS!");
	}
	
	public Map getCurrentLevel() {
		return currentLevel;
	}
	
	public static void endGame() {
		System.out.println("\nGAME OVER..");
	}
	
}
