package Models;

public class RubberDuck extends Duck {
	
	@Override
	public void quack() {
		System.out.println("Sqeak sqeak!");
	}
	@Override
	public void display() {
		System.out.println("Looks like a Rubber Duck!");
		
	}

}
