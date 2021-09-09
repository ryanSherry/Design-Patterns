package strategyPattern.models.ducks;

import strategyPattern.models.behaviors.FlyingWithWings;
import strategyPattern.models.behaviors.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyingBehavior = new FlyingWithWings();
	}

	@Override
	public void display() {
		System.out.println("Looks like a mallard!");
		
	}

}
