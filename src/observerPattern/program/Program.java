package observerPattern.program;

import observerPattern.observer.Observer;
import observerPattern.observer.BinaryObserver;
import observerPattern.subject.DecimalData;
import observerPattern.subject.Subject;

public class Program {

	public static void main(String[] args) {
		//create the Subject
		Subject decimalData = new DecimalData();
		
		//create the Observers
		Observer binaryObserver = new BinaryObserver(decimalData);
		
		//set decimal value
		decimalData.setDecimalValue(50);
		
		//set new decimal value
		decimalData.setDecimalValue(100);
	}

}
