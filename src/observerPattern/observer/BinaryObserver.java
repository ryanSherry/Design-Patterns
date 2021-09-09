package observerPattern.observer;

import observerPattern.display.DisplayElement;
import observerPattern.subject.DecimalData;
import observerPattern.subject.Subject;

public class BinaryObserver implements Observer,DisplayElement {
	
	private Subject decimalSubject;
	private int decimalValue;
	
	//Register Observer to Subject
	public BinaryObserver(Subject decimalSubject) {
		this.decimalSubject = decimalSubject;
		decimalSubject.registerObserver(this);
	}

	@Override
	public void update() {
		DecimalData decimalData = null;
		if (decimalSubject instanceof DecimalData) {
			decimalData = (DecimalData) decimalSubject;
			decimalValue = decimalData.getDecimalValue();
		}
		display();
		
	}
	
	
	@Override
	public void display() {
		System.out.println("Binary String: " + 
	Integer.toBinaryString(decimalValue));
	}

}
