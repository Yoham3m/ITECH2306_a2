package assignemnt2;
import java.util.*;
import java.util.Scanner;


public class MenuSystem {
	private Scanner scan;
	private ArrayList<QuoteSystem> bookings;
	
	public MenuSystem() {
		bookings = new ArrayList<QuoteSystem>();
		scan = new Scanner(System.in);
	}
	public  void begin() {
		boolean finished = false;
		int userSelection;
		do {
			System.out.println("1. Make a quote for Radio and Spotify");
			System.out.println("2. Make a quote for televison");
			System.out.println("3. Make a quote for Newspaper");
			System.out.println("4. Make a quote for Web and App");
			System.out.println("5. Check the details of anyquote");
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
					
					break;
				case 4:
					break; 
				
				case 5:
					displayBooking();
					break;
				case 0:
					finished = true;
					break;
				default:
					System.out.println("Invalid selection, please re-enter.");
			}
		} while ( ! finished);
	}
	public void displayCurrent() {
		
	}

	public void displayBooking()
	{
		int position;
		
		// Ask for, then actually obtain, the position in the list of the booking to be displayed.
		System.out.println("Enter the booking's position:");
		position = scan.nextInt();
		scan.nextLine();
		
		// Display the catering job booking at that position...
		if(position < bookings.size() & position>=0) {
			QuoteSystem currentBooking = bookings.get(position);	
			System.out.println(currentBooking.toString());
			System.out.println("The booking price is $" + currentBooking.getPrice());
		}else {
			int max = bookings.size() -1 ;
			System.out.println("Plz enter a postion between 0 and "+ max);
		}
	
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
		bookings.add(a);
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
		bookings.add(b);
	}
	
	
	
	
	
	}
	
	
	
	
