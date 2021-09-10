package observerPatternExampleTwo.subject;

import observerPatternExampleTwo.observer.Observer;

public interface Subject {
	//register observer
	
	public void registerObserver(Observer o);
	
	//remove observer
	
	public void removeObserver(Observer o);
	
	//notify observer of changes
	
	public void notifyObserver();

	public void setCryptoValue(int i);
	
}
