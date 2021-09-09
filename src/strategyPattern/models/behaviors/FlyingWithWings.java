package strategyPattern.models.behaviors;

public class FlyingWithWings implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("Flying high in the sky!");
	}

}
