package assignemnt2;

import java.util.ArrayList;

public class Q_Newspaper extends QuoteSystem{
	private double height;
	private double width;
	private double baseCost;
	private double colourCost;
	private double addtionCost;
	private ArrayList newspaperName =new ArrayList<String>();
	


	public Q_Newspaper(double height, double width, double baseCost, double colourCost, double addtionCost,
			ArrayList newspaperName) {
		super();
		this.height = height;
		this.width = width;
		this.baseCost = baseCost;
		this.colourCost = colourCost;
		this.addtionCost = addtionCost;
		this.newspaperName = newspaperName;
	}



	@Override
	public double getPrice() {
		
		return baseCost+colourCost +addtionCost  ;
	}



	@Override
	public String toString() {
		
		String print = "";
		print += String.format("The cost of Newspaper advertisement is  %.2f", getPrice());
		print += "Companies name: ";
		for(int i = 0; i<newspaperName.size(); i++) {
			print += newspaperName.get(i) + " ";
		}
	
		return print;
	}



	
	
	
	
}
