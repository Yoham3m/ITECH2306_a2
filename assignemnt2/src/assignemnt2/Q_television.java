package assignemnt2;

public class Q_television extends QuoteSystem {
	private int weekAccounted; 
	private double BasicPrice;
	private double extraPrice;
	private String exposureType;
	
	



	public Q_television(int weekAccounted, double basicPrice, double extraPrice, String exposureType) {
		super();
		this.weekAccounted = weekAccounted;
		BasicPrice = basicPrice;
		this.extraPrice = extraPrice;
		this.exposureType = exposureType;
	}




	@Override
	public double getPrice() {
		return weekAccounted*(BasicPrice+extraPrice);
	}




	@Override
	public String toString() {
		return "1 * " + exposureType + "Exposure TV campaign for " + weekAccounted + "weeks:            " +this.getPrice();
	}
	
	






}
