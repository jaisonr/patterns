package observerPattern;

public class GrabStock {
	
	public static void main(String[] args) {
		StockGrabber stockGrabber=new StockGrabber();
		StockObserver observer1=new StockObserver(stockGrabber);
		stockGrabber.register(observer1);
		stockGrabber.setAaplPrice(12.5);
		stockGrabber.setIbmPrice(56.6);
	}

}
