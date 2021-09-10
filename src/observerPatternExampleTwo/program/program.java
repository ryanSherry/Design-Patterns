package observerPatternExampleTwo.program;

import observerPatternExampleTwo.observer.Observer;
import observerPatternExampleTwo.observer.User;
import observerPatternExampleTwo.subject.CryptoExchange;
import observerPatternExampleTwo.subject.Subject;

public class program {

	public static void main(String[] args) {
		Subject subject = new CryptoExchange();
		Observer observer = new User(subject);
		
		subject.setCryptoValue(10);

	}

}
