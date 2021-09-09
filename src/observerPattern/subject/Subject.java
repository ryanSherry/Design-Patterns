package observerPattern.subject;

import observerPattern.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	public void setDecimalValue(int num);
}
