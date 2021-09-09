package strategyPattern.models.ducks;

import strategyPattern.models.behaviors.FlyNoWay;
import strategyPattern.models.behaviors.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyingBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("Looks like a Rubber Duck!");
		
	}

}
