package fatoryPattern;

public class SimplePizzaFactory {
	
	Pizza pizza = null;
	
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(type.equals("pepperonni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
