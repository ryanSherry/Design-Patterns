package decoratorPattern;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1.99;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description = beverage.getDescription() + " Mocha";;
	}

}
