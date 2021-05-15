package assignemnt2;
import java.util.*;

public class Q_Radio  extends QuoteSystem{
	private String detailInfo;
	private int videoLength; //  
	private int timeOfBH;
	private int timeOfE;
	private int timeOfO;
	

	public Q_Radio(String detailInfo, int videoLength, int timeOfBH, int timeOfE, int timeOfO) {
		super();
		this.detailInfo = detailInfo;
		this.videoLength = videoLength;
		this.timeOfBH = timeOfBH;
		this.timeOfE = timeOfE;
		this.timeOfO = timeOfO;
	}




	public double getPrice() {
		double totalcost = 0;
		totalcost= 20*videoLength/15 + 70*timeOfBH+60*timeOfE+35*timeOfO;
		return totalcost;
		
	}




	@Override
	public String toString() {
		return "1 * Radio advertisement:  " + detailInfo + "for " +  videoLength + "seconds:       $" +this.getPrice();
	}   



	
}
