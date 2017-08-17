package homeLoanCalculator;

import java.util.*;

public class Menu {
	
	public Menu(){
		
	}
	
	int cheapHouse, chosenHouse, medianHouse;
	int priceAvo;
	
	
	{
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch(option){
		case 1 :
			enterHousePrices();
			break;
			
		case 2 :
			enterAvoPrice();
			break;
			
		case 3 :
			calculateDeposit();
			break;
			
		case 4 :
			System.out.println("Exiting System...");
            break;
			
		default:
			System.out.println("Invalid Option");
		}
		while(option!=0){
			
		}

			
	
		
	  
	
	}
	
	
	private void enterHousePrices() {
		
		
	}
	private void calculateDeposit() {
		// TODO Auto-generated method stub
		
	}
	private void enterAvoPrice() {
		// TODO Auto-generated method stub
		
	}

}
