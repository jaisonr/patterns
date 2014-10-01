package observerPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;

	public StockGrabber() {
		observers=new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex=observers.indexOf(deleteObserver);
		System.out.println("Observer "+(observerIndex+1)+" removed");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer :observers){
			observer.update(ibmPrice, aaplPrice);
		}
	}
	public double getIbmPrice() {
		return ibmPrice;
	}
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}
	public double getAaplPrice() {
		return aaplPrice;
	}
	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}

}
