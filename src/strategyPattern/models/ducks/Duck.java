package strategyPattern.models.ducks;

import strategyPattern.models.behaviors.FlyingBehavior;
import strategyPattern.models.behaviors.QuackBehavior;

public abstract class Duck {
	
	FlyingBehavior flyingBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyingBehavior.fly();
	}
	
	public void swim() {
		System.out.println("Swimming like a duck!");
	}
	
	public void setFlyingBehavior(FlyingBehavior fb) {
		flyingBehavior = fb;
	}
	
	public void setQuackingBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public abstract void display();
	
}
