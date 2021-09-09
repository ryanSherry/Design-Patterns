package Models;

public abstract class Duck {
	public Duck() {
		
	}
	
	public void quack() {
		System.out.println("Quack Quack!");
	}
	
	public void swim() {
		System.out.println("Swimming like a duck!");
	}
	
	public abstract void display();
	
}
