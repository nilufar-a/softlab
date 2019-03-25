package softlab;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String in;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("\nChoose the test case from the list:");
			System.out.println("1.Create Game\n2.Move Train\n3.Train crashes");
			in=scanner.nextLine();
			
			switch(in) {
				case "1":
					createGameTestCase();
					break;
				case "2":
					trainMovesTestCase();
					break;
				case "3":
					trainCrashesTestCase();
			}
		}
	}
	
	public static void createGameTestCase() {
		Game game=new Game();
		game.startGame();
	}
	
	public static void trainMovesTestCase() {
		Engine e1=new Engine("e1");
		Car c1=new Car("c1");
		Car c2=new Car("c2");
		TrackSegment ts0=new TrackSegment("ts0");
		TrackSegment ts1=new TrackSegment("ts1");
		TrackSegment ts2=new TrackSegment("ts2");
		TrackSegment ts3=new TrackSegment("ts3");
		ts0.setNeighboor(ts1, Direction.Up);
		ts1.setNeighboor(ts2, Direction.Up);
		ts2.setNeighboor(ts3, Direction.Up);
		e1.setSegment(ts2);
		c1.setSegment(ts1);
		c2.setSegment(ts0);
		e1.addCar(c1);
		e1.addCar(c2);
		Timers timer=new Timers();
		timer.addEngine(e1);
		timer.addCar(c1);
		timer.addCar(c2);
		timer.tick();
	}
	
	public static void trainCrashesTestCase() {
		Engine e=new Engine("e");
		Engine v=new Engine("v");
		TrackSegment ts=new TrackSegment("ts");
		Game game=new Game();
		v.setSegment(ts);
		e.setSegment(ts);
		
		
	}
	
}
