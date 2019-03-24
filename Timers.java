package lab;
 import java.util.Timer;
import java.util.TimerTask;

public class Timers { 
Engine Engines[];
Car Cars[];
static int count =0;
public static void main(String args[])
{
	TimerTask task=new TimerTask() 
	{
		
		@Override 
		public void run() {
			count++;
			System.out.print("timer ticks and train moves");

			//WRITE MOVE ENGINE 
			// WRITE MOVE CAR
			
				
			
	}
		
		
		
};

Timer timer = new Timer();
timer.scheduleAtFixedRate(task,0,100000);

	

}
		
};



