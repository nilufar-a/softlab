package lab;

public class Engine extends Vehicle {
	
boolean isVisible; 

public void pullCar(Direction d) {
	 System.out.print("engine pulls cars");
}
	
public void crashWith (Vehicle v) {
	 System.out.print("engine crash with vehicle");
}
	
public void setVisible() {
	
	isVisible=true;
	 System.out.print("set visible");
}
	
public void setInvisible() {
	isVisible=false;
 System.out.print("set invisible");
}};
