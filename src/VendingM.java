/**
 * 
 */
import java.util.Scanner;
/**
 * @author olame muliri
 *
 */
public class VendingM {

	/**
	 * @param args
	 */
    /**
     * ALGORITHM
     * START
     * DECLARE variables
     * PROMPT user to enter number of dollar inserted
     * STORE number in variable dollar
     * PROMPT user to enter number of quaters inserted
     * STORE number in variable quaters
     * PROMPT user to enter number of dimes inserted
     * STORE number in variable dimes
     * PROMPT user to enter number of nickels inserted
     * STORE number in variable nickels
     * totalAmountInCents = (dollar*100) + (quaters*25) + (dimes*10) + (nickels*5)
     * totalAmount = totalAmountInCents/100
     * DISPLAY totalAmount
     * PROMPT user to enter dollar cost of the item
     * STORE number in variable dollarCostOfItem
     * PROMPT user to enter remaining cost of the item(in cents)
     * STORE number in variable remainingCostCents
     * itemCostInCents = (dollarCostOfItem * 100) + remainingCostCents
     * itemCost = itemCostInCents/100
     * DISPLAY itemCost
     * changeInCents = totalAmountInCents - itemCostInCents
     * change = totalAmount - itemCost
     * DISPLAY change
     * dollar = changeInCents/100
     * cents = changeInCents - (dollar* 100)
     * numberOfQuaters = cents/valueOfQuater
     * cents =  cents%valueOfQuater
     * numberOfDimes = cents / valueOfDime
     * cents = cents - (numberOfDimes*valueOfDime)
     * numberOfNickels = cents / valueOfNickel
     * DISPLAY dollar, numberOfQuaters, numberOfDimes, numberOfNickels
     * END
     */
    
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int dollar = 0;
		int quaters = 0;
		int dimes = 0;
		int nickels = 0;
        int cents = 0;
		int numberOfQuaters = 0;
		int numberOfDimes = 0;
		int numberOfNickels = 0;
		float valueInCents = 100;
		int valueOfQuater = 25;
		int valueOfDime = 10;
		int valueOfNickel = 5;
		int dollarCostOfItem = 0;
		int remainingCostCents = 0;
        int totalAmountInCents = 0;
        int itemCostInCents = 0;
        int changeInCents = 0;
        float totalAmount = 0;
		float itemCost = 0;
		float change = 0;

        //end of declaration and initialization

		System.out.println("Please enter number of dollars inserted");
		dollar = keyboard.nextInt();

		System.out.println("Please enter number of quaters inserted");
		quaters = keyboard.nextInt();

		System.out.println("Please enter number of dimes inserted");
		dimes = keyboard.nextInt();

		System.out.println("Please enter number of nickels inserted");
		nickels = keyboard.nextInt();

		totalAmountInCents = (dollar*(int)valueInCents) + (quaters*valueOfQuater) + (dimes*valueOfDime) + (nickels*valueOfNickel);
        totalAmount = totalAmountInCents/valueInCents;

		System.out.printf("You inserted $%.2f\n", totalAmount);

        //The following feature can be implemented in different ways
        //For our case we are required to input the cost
        //This can be a preset cost associated to the item number
        //in the vending machine

		System.out.println("Please enter the dollar cost of the item");
		dollarCostOfItem = keyboard.nextInt();

		System.out.println("Please enter the remaining cost of the item as cents, in 5 cent increments");
		remainingCostCents = keyboard.nextInt();

		itemCostInCents = (dollarCostOfItem*(int)valueInCents) + remainingCostCents;
        itemCost = itemCostInCents/valueInCents;

        //Display the cost of the item

		System.out.printf("Your item cost %.2f \n",itemCost);
		changeInCents = totalAmountInCents - itemCostInCents;
        change = totalAmount - itemCost;

        //Display change

		System.out.printf("Your change is %.2f \n", change);
        dollar = changeInCents/(int)valueInCents;
        cents = changeInCents - (dollar*(int)valueInCents);
		numberOfQuaters = (int)cents/valueOfQuater;
		cents =  cents%valueOfQuater;
		numberOfDimes = (int)cents / valueOfDime;
		cents = cents - (numberOfDimes*valueOfDime);
		numberOfNickels = (int)cents / valueOfNickel;
        System.out.printf("as:\ndollars: %d\nquaters: %d\ndimes: %d\nnickel: %d\n",dollar,numberOfQuaters,numberOfDimes,numberOfNickels);

		
	}

}
