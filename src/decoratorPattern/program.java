package decoratorPattern;

public class program {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " is $" + beverage.cost());
	}

}
