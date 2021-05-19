package assignemnt2;
import java.util.*;


public class MenuSystem {
	private Scanner scan;
	private user user1;
	private ArrayList<user> userRecords = new ArrayList<>();
	//private ArrayList<QuoteSystem> bookings;
	
	public MenuSystem() {
		//bookings = new ArrayList<QuoteSystem>();
		scan = new Scanner(System.in);
	}
	
	// pre user
	public void setup() {
		QuoteSystem r1 = new Q_Radio("openning days of school",30,2,2,2);
		user user2 = new user("Apple");
		user2.addQuote(r1);
		userRecords.add(user2);
	}
	public  void begin() {
		setup();
		System.out.println("Are you exising user? ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			System.out.println("What is your id : ");
			for(user tem : userRecords) {
				System.out.println(tem.toString());
			}
			int num = scan.nextInt();
			user1 = userRecords.get(num-1);
		}else {
			user1 = new user("New user");
		}
		
		
		boolean finished = false;
		int userSelection;
		do {
			System.out.println("1. Make a quote for Radio and Spotify");
			System.out.println("2. Make a quote for televison");
			System.out.println("3. Make a quote for Newspaper");
			System.out.println("4. Make a quote for Web and App");
			System.out.println("5. Check the details of current quote");
			System.out.println("0. Finish and exit");
			userSelection = scan.nextInt();
			scan.nextLine();
			
			switch (userSelection)
			{
				case 1:
					addRadio();
					break;
				case 2:
					addTV();
					break;
				case 3 :
					addNewspaper();
					break;
				case 4:
					addWeb();
					break; 
				
				case 5:
					
					displayCurrentBooking();
					break;
				case 0:
					finished = true;
					break;
				default:
					System.out.println("Invalid selection, please re-enter.");
			}
		} while ( ! finished);
	}

	public void displayCurrentBooking()
	{
		double total = 0;
		for(int i=0; i<user1.getQuoteList().size(); i++) {
			total += ((QuoteSystem) user1.getQuoteList().get(i)).getPrice();
			System.out.println(user1.getQuoteList().get(i));
		}
		System.out.println(total);
		

	}
	
	
	public void addRadio() {
		String detailInfo;
		int videoLength;
		int timeOfBH;
		int timeOfE;
		int timeOfO;
		System.out.print("What will be quote about: ");
		detailInfo = scan.nextLine();
		System.out.print("How many seconds of the quote? ");
		videoLength = scan.nextInt();

		System.out.println("Would you like it played during business-hours: Y/N ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			System.out.println("How many weeks do you want? Min 1 week :");
			timeOfBH = scan.nextInt();
		}else {
			timeOfBH=0;
		}
		
		System.out.println("Would you like it played during evenings: Y/N ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			System.out.println("How many weeks do you want? Min 1 week :");
			timeOfE = scan.nextInt();
		}else {
			timeOfE=0;
		}
		
		System.out.println("Would you like it played during overnight and weekends: Y/N ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			System.out.println("How many weeks do you want? Min 1 week :");
			timeOfO = scan.nextInt();
		}else {
			timeOfO=0;
		}
		Q_Radio a = new Q_Radio(detailInfo,videoLength,timeOfBH,timeOfE,timeOfO);
		user1.addQuote(a);
	}
	
	public void addTV() {
		int weekAccounted;
		double basicPrice;
		double extraPrice = 0;
		String exposureType;
		System.out.println("How many weeks do you want for the advertiment? ");
		weekAccounted = scan.nextInt();
		System.out.println("The basic price:$110 and advanced price: $250");
		System.out.println("What do you want? B or A ");
		if (scan.next().toUpperCase().charAt(0) == 'B') {
			basicPrice = 110.00;
		}else {
			basicPrice = 250.00;
		}
		System.out.println("How is  the exposure ? High,Medium or Low ");
		exposureType = scan.next();
		if (exposureType.toUpperCase().charAt(0) == 'H') {
			extraPrice = 400.00;
		}else if (exposureType.toUpperCase().charAt(0) == 'M') {
			extraPrice = 280.00;
		}else if (exposureType.toUpperCase().charAt(0) == 'L') {
			extraPrice = 150.00;
		}
		Q_television b = new Q_television(weekAccounted,basicPrice,extraPrice,exposureType);
		user1.addQuote(b);
	}

	public void addNewspaper() {
		double height;
		double width;
		double size;
		double baseCost;
		double colourCost;
		double addtioncost;
		String colourType;
		String cM; 
		ArrayList<String> companyName = new ArrayList<String>();
		System.out.println("Please enter for the height: ");
		height = scan.nextDouble();
		System.out.println("Please enter for the width: ");
		width = scan.nextDouble();
		// for the basecost
		if (width == 4) {
			baseCost = 5*height*1.35;
			size = 5 *height;
			
		}else {
			baseCost= width*height *1.35;
			size  = width*height;
		}
		System.out.println("Do you want to provide the picture? ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			baseCost = baseCost +20;
		}
		// this is for asking for price for the basic coat
		System.out.println("Do you need advertisement with plain Black-And-White or Full Colour ? B OR F ");
		if (scan.next().toUpperCase().charAt(0) == 'B') {
			colourCost = size * 2.20;
			
		}else {
			colourCost = size * 4.80;
			}
		// prominent need?
		System.out.println("Do you need the ad placed in a prominent place? Y or N ");
		if (scan.next().toUpperCase().charAt(0) == 'Y') {
			addtioncost = 10;
			
		}else {
			addtioncost =0;
			}
		// asking for how many newspaper it will appear in
		System.out.println("What newspaper brand you are wanting to use ?");
		cM =scan.next();
		companyName.add(cM);
		boolean flag = true;
		while (flag) {
			System.out.println("Do you want to add another newspaper brand?");

			if (scan.next().toUpperCase().charAt(0) == 'Y') {
				System.out.println("Please enter a new brand: ");
				cM =scan.next();
				companyName.add(cM);
			}else {
				break;
				}
		}
		Q_Newspaper c = new Q_Newspaper(height,width,baseCost,colourCost,addtioncost,companyName);
		user1.addQuote(c);
	}
	
	//web
	public void addWeb() {
		double eachPrice;
		int amountPicture;
		System.out.println("What type of the picture do you want to appear? Static or Animated");
		if (scan.next().toUpperCase().charAt(0) == 'S') {
			eachPrice = 5;
		}else {
			eachPrice = 7;
			}
		System.out.println("Enter the number of picture that you want ?");
		amountPicture = scan.nextInt();
		Q_Web d= new Q_Web(eachPrice,amountPicture);
		user1.addQuote(d);
	}
}
	
	
