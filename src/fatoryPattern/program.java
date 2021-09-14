package fatoryPattern;

public class program {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pepperonniPizza = factory.createPizza("pepperonni");
		pepperonniPizza.prepare();
		Pizza cheesePizza = factory.createPizza("cheese");
		cheesePizza.prepare();
	}

}
