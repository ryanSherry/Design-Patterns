package Models;

public class RedHeadDuck extends Duck implements Flyable {

	@Override
	public void display() {
		System.out.println("Looks like a redhead duck!");
		
	}

	@Override
	public void fly() {
		System.out.println("Flying like a duck");	
	}

}
