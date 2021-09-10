package observerPatternExampleTwo.observer;

import observerPatternExampleTwo.display.DisplayElement;
import observerPatternExampleTwo.subject.CryptoExchange;
import observerPatternExampleTwo.subject.Subject;

public class User implements Observer, DisplayElement {
	private Subject subject;
	private int value;

	public User(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update() {
		if (subject instanceof CryptoExchange) {
			this.value = ((CryptoExchange) subject).getCryptoValue();
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("Crypto is up to: " + value);
	}

}
