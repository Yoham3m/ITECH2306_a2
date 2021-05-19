package assignemnt2;

public class Q_Web  extends QuoteSystem{
	private double eachPrice;
	
	private int amountPicture; 
	
	
	
	public Q_Web(double eachPrice, int amountPicture) {
		super();
		this.eachPrice = eachPrice;
		this.amountPicture = amountPicture;
	}








	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return eachPrice * amountPicture;
	}
	
	@Override
	public String toString() {
		return String.format("The cost of web advertisement  is %.2f", getPrice());
	}
	

}
