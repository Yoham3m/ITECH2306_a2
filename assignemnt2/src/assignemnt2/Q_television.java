package assignemnt2;

public class Q_television extends QuoteSystem {
	private int weekAccounted; 
	private double basicPrice;
	private double extraPrice;
	private String exposureType;
	
	



	public Q_television(int weekAccounted, double basicPrice, double extraPrice, String exposureType) {
		super();
		this.weekAccounted = weekAccounted;
		this.basicPrice = basicPrice;
		this.extraPrice = extraPrice;
		this.exposureType = exposureType;
	}




	@Override
	public double getPrice() {
		return weekAccounted*(basicPrice+extraPrice);
	}




	@Override
	public String toString() {
		return String.format("1* Televison advertisement : %s  Exposure TV campaign for %d. Current price will be %.2f ",exposureType , weekAccounted,this.getPrice());
	}
	
	






}
