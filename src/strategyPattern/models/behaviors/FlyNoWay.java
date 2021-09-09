package strategyPattern.models.behaviors;

public class FlyNoWay implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly...won't fly");
	}

}
