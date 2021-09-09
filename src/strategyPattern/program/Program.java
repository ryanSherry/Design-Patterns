package strategyPattern.program;

import strategyPattern.models.behaviors.FlyingWithWings;
import strategyPattern.models.ducks.Duck;
import strategyPattern.models.ducks.MallardDuck;
import strategyPattern.models.ducks.RubberDuck;

public class Program {

	public static void main(String[] args) {
		//test ducks
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.swim();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack();		
		rubberDuck.performFly();
		
	}

}
