package softlab;

public abstract class Vehicle {
	
	Car cars[];
	//Engine engine;
	protected TrackSegment segment;
	protected String name;
	
	public abstract void move(Direction dir);
	
	public void crashWith(Vehicle v) {
		System.out.println("\n"+this.getObjectName()+" crashed into "+v.getObjectName());
		Game.endGame();
	}
	
	public void setSegment(TrackSegment ts) {
		segment=ts;
		segment.accept(this);
		if(ts.checkCollide()) {
			crashWith(ts.getOtherVehicle());
		}
	}
	public String getObjectName() {
		return name;
	}
}
