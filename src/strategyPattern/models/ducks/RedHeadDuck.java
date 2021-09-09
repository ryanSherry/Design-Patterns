package strategyPattern.models.ducks;

import strategyPattern.models.behaviors.FlyingWithWings;
import strategyPattern.models.behaviors.Quack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyingBehavior = new FlyingWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Looks like a redhead duck!");
		
	}

}
