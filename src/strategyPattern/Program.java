package strategyPattern;

public class Program {

	public static void main(String[] args) {
		//test ducks
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.quack();  
		
	}

}
