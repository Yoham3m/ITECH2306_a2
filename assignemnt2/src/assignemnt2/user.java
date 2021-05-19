package assignemnt2;
import java.util.*;

public class user {
	
	private String name;
	private ArrayList<QuoteSystem> userInformation;
	
	
	public user(String name) {
		 
		super();
		this.name = name;
		userInformation = new ArrayList<QuoteSystem>();
	}
	
	public ArrayList getQuoteList() {
		return userInformation ;
	}
	
	public void addQuote(QuoteSystem tem) {
		userInformation.add(tem);
	}
	
	public void deleteQuote() {
		userInformation.removeAll(userInformation);}
	
	
	@Override
	public String toString() {
		return "Hello " + name;
	}
	
	
}
