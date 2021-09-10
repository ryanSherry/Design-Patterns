package observerPattern.subject;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.Observer;

public class DecimalData implements Subject {
	
	//ArrayList to hold the Observers
	private List<Observer> observers;
	private int decimalValue;
	
	public DecimalData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) observers.remove(index);
	}
	
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void valuesChanged() {
		notifyObserver();
	}
	
	public int getDecimalValue() {
		return decimalValue;
	}
	
	public void setDecimalValue(int decimalValue) {
		this.decimalValue = decimalValue;
		valuesChanged();
	}

}
