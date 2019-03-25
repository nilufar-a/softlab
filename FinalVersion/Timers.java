package softlab;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Timers { 
	private ArrayList<Engine> engines;
	private ArrayList<Car> cars;
	
	public Timers() {
		engines=new ArrayList<>();
		cars=new ArrayList<>();
	}
	
	public void tick() {
		if(engines.size()!=0)
			for(int i=0;i<engines.size();++i) {
				System.out.println("\nMove function is being called for each engine...");
				engines.get(i).move(Direction.Up);		
		}
	}
	public void addEngine(Engine e) {	
		engines.add(e);
	}

	public void addCar(Car c) {
		cars.add(c);
	}
}



