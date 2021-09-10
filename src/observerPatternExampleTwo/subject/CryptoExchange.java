package observerPatternExampleTwo.subject;

import java.util.ArrayList;
import java.util.List;

import observerPatternExampleTwo.observer.Observer;

public class CryptoExchange implements Subject {
	private List<Observer> observers;
	private Subject subject;
	private int cryptoValue;

	public CryptoExchange() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			// update each observer
			observer.update();
		}
	}

	public void setCryptoValue(int num) {
		this.cryptoValue = num;
		notifyObserver();
	}

	public int getCryptoValue() {
		return cryptoValue;
	}

}
