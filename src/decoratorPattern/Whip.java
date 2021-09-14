package decoratorPattern;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + .41;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.description + " whip";
	}

}
