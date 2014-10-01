package observerPattern;

public class StockObserver implements Observer {
	private double ibmPrice;
	private double aaplPrice;
	private static int observerIdTracker=0;
	private int observerId;
	
	Subject stockGrabber;
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber=stockGrabber;
		this.observerId=++observerIdTracker;
		System.out.println("New Observer : "+ this.observerId);
		stockGrabber.register(this);
	}
	@Override
	public void update(double ibmPrice, double aaplPrice) {
		this.ibmPrice=ibmPrice;
		this.aaplPrice=aaplPrice;
		printPrices();
	}
	public void printPrices(){
		System.out.println("Stock price of IBM :"+this.ibmPrice);
		System.out.println("Stock price of Apple :"+this.aaplPrice);
	}

}
